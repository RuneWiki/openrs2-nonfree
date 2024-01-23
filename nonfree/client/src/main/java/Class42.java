import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!uc;")
	private Class164 aClass164_3 = new Class164();

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Z")
	private boolean aBoolean96 = false;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public int anInt1303 = 0;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class42() {
		@Pc(20) Class163 local20 = Static199.aClass17_3.method449(this, 5);
		while (local20.anInt5259 == 0) {
			Static162.method2645(10L);
		}
		if (local20.anInt5259 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!pm;IZ)Lclient!on;")
	public Class8_Sub1_Sub4_Sub2 method936(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class8_Sub1_Sub4_Sub2 local3 = new Class8_Sub1_Sub4_Sub2();
		local3.aBoolean315 = false;
		local3.aLong204 = arg1;
		local3.aClass133_3 = arg0;
		local3.anInt3875 = 3;
		this.method939(local3);
		return local3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public void method937() {
		this.aBoolean96 = true;
		@Pc(10) Class164 local10 = this.aClass164_3;
		synchronized (this.aClass164_3) {
			this.aClass164_3.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(27) InterruptedException local27) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!on;Z)V")
	private void method939(@OriginalArg(0) Class8_Sub1_Sub4_Sub2 arg0) {
		@Pc(3) Class164 local3 = this.aClass164_3;
		synchronized (this.aClass164_3) {
			this.aClass164_3.method3993(arg0);
			this.anInt1303++;
			this.aClass164_3.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!pm;)Lclient!on;")
	public Class8_Sub1_Sub4_Sub2 method941(@OriginalArg(0) int arg0, @OriginalArg(2) Class133 arg1) {
		@Pc(9) Class8_Sub1_Sub4_Sub2 local9 = new Class8_Sub1_Sub4_Sub2();
		local9.anInt3875 = 1;
		@Pc(16) Class164 local16 = this.aClass164_3;
		synchronized (this.aClass164_3) {
			@Pc(25) Class8_Sub1_Sub4_Sub2 local25 = (Class8_Sub1_Sub4_Sub2) this.aClass164_3.method3989();
			while (true) {
				if (local25 == null) {
					break;
				}
				if (local25.aLong204 == (long) arg0 && arg1 == local25.aClass133_3 && local25.anInt3875 == 2) {
					local9.aByteArray33 = local25.aByteArray33;
					local9.aBoolean313 = false;
					return local9;
				}
				local25 = (Class8_Sub1_Sub4_Sub2) this.aClass164_3.method3988();
			}
		}
		local9.aByteArray33 = arg1.method3273(arg0);
		local9.aBoolean313 = false;
		local9.aBoolean315 = true;
		return local9;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!pm;[BIB)Lclient!on;")
	public Class8_Sub1_Sub4_Sub2 method942(@OriginalArg(0) Class133 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub1_Sub4_Sub2 local7 = new Class8_Sub1_Sub4_Sub2();
		local7.aBoolean315 = false;
		local7.aByteArray33 = arg1;
		local7.anInt3875 = 2;
		local7.aClass133_3 = arg0;
		local7.aLong204 = arg2;
		this.method939(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean96) {
			@Pc(12) Class164 local12 = this.aClass164_3;
			@Pc(19) Class8_Sub1_Sub4_Sub2 local19;
			synchronized (this.aClass164_3) {
				local19 = (Class8_Sub1_Sub4_Sub2) this.aClass164_3.method3992();
				if (local19 == null) {
					try {
						this.aClass164_3.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt1303--;
			}
			try {
				if (local19.anInt3875 == 2) {
					local19.aClass133_3.method3269(local19.aByteArray33, local19.aByteArray33.length, (int) local19.aLong204);
				} else if (local19.anInt3875 == 3) {
					local19.aByteArray33 = local19.aClass133_3.method3273((int) local19.aLong204);
				}
			} catch (@Pc(79) Exception local79) {
				Static88.method1444(null, local79);
			}
			local19.aBoolean313 = false;
		}
	}
}
