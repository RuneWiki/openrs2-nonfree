import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class259 implements Runnable {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Lclient!pda;")
	private final Class283 aClass283_8 = new Class283();

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	public int anInt7604 = 0;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "Z")
	private boolean aBoolean580 = false;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class259(@OriginalArg(0) Class47 arg0) {
		@Pc(20) Class201 local20 = arg0.method941(this, 5);
		while (local20.anInt5729 == 0) {
			Static564.method7845(10L);
		}
		if (local20.anInt5729 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject16;
	}

	@OriginalMember(owner = "client!nn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean580) {
			@Pc(10) Class283 local10 = this.aClass283_8;
			@Pc(18) Class3_Sub4_Sub10_Sub2 local18;
			synchronized (this.aClass283_8) {
				local18 = (Class3_Sub4_Sub10_Sub2) this.aClass283_8.method7034();
				if (local18 == null) {
					try {
						this.aClass283_8.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
					continue;
				}
				this.anInt7604--;
			}
			try {
				if (local18.anInt4514 == 2) {
					local18.aClass73_1.method2047(local18.aByteArray27, (int) local18.aLong363, local18.aByteArray27.length);
				} else if (local18.anInt4514 == 3) {
					local18.aByteArray27 = local18.aClass73_1.method2048((int) local18.aLong363);
				}
			} catch (@Pc(85) Exception local85) {
				Static64.method799((String) null, local85);
			}
			local18.aBoolean389 = false;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([BLclient!dka;IB)Lclient!hh;")
	public Class3_Sub4_Sub10_Sub2 method6362(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub4_Sub10_Sub2 local7 = new Class3_Sub4_Sub10_Sub2();
		local7.aClass73_1 = arg1;
		local7.aLong363 = (long) arg2;
		local7.aByteArray27 = arg0;
		local7.anInt4514 = 2;
		local7.aBoolean388 = false;
		this.method6365(local7);
		return local7;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!hh;)V")
	private void method6365(@OriginalArg(1) Class3_Sub4_Sub10_Sub2 arg0) {
		@Pc(2) Class283 local2 = this.aClass283_8;
		synchronized (this.aClass283_8) {
			this.aClass283_8.method7036(arg0);
			this.anInt7604++;
			this.aClass283_8.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILclient!dka;B)Lclient!hh;")
	public Class3_Sub4_Sub10_Sub2 method6366(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1) {
		@Pc(9) Class3_Sub4_Sub10_Sub2 local9 = new Class3_Sub4_Sub10_Sub2();
		local9.anInt4514 = 1;
		@Pc(15) Class283 local15 = this.aClass283_8;
		synchronized (this.aClass283_8) {
			@Pc(32) Class3_Sub4_Sub10_Sub2 local32 = (Class3_Sub4_Sub10_Sub2) this.aClass283_8.method7031();
			while (true) {
				if (local32 == null) {
					break;
				}
				if ((long) arg0 == local32.aLong363 && arg1 == local32.aClass73_1 && local32.anInt4514 == 2) {
					local9.aByteArray27 = local32.aByteArray27;
					local9.aBoolean389 = false;
					return local9;
				}
				local32 = (Class3_Sub4_Sub10_Sub2) this.aClass283_8.method7035();
			}
		}
		local9.aByteArray27 = arg1.method2048(arg0);
		local9.aBoolean389 = false;
		local9.aBoolean388 = true;
		return local9;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!dka;)Lclient!hh;")
	public Class3_Sub4_Sub10_Sub2 method6367(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1) {
		@Pc(7) Class3_Sub4_Sub10_Sub2 local7 = new Class3_Sub4_Sub10_Sub2();
		local7.aClass73_1 = arg1;
		local7.aBoolean388 = false;
		local7.aLong363 = (long) arg0;
		local7.anInt4514 = 3;
		this.method6365(local7);
		return local7;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	public void method6369() {
		this.aBoolean580 = true;
		@Pc(9) Class283 local9 = this.aClass283_8;
		synchronized (this.aClass283_8) {
			this.aClass283_8.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread3 = null;
	}
}
