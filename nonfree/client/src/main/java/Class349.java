import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class349 implements Runnable {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!ca;")
	private final Class39 aClass39_11 = new Class39();

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Z")
	private boolean aBoolean837 = false;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public int anInt10080 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Ljava/lang/Thread;")
	private Thread aThread7;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!ufa;)V")
	public Class349(@OriginalArg(0) Class326 arg0) {
		@Pc(20) Class66 local20 = arg0.method7795(this, 5);
		while (local20.anInt2308 == 0) {
			Static1.method125(10L);
		}
		if (local20.anInt2308 == 2) {
			throw new RuntimeException();
		}
		this.aThread7 = (Thread) local20.anObject4;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!sd;IB)Lclient!kaa;")
	public Class3_Sub4_Sub8_Sub1 method8175(@OriginalArg(0) Class294 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub4_Sub8_Sub1 local7 = new Class3_Sub4_Sub8_Sub1();
		local7.anInt5577 = 1;
		@Pc(13) Class39 local13 = this.aClass39_11;
		synchronized (this.aClass39_11) {
			@Pc(21) Class3_Sub4_Sub8_Sub1 local21 = (Class3_Sub4_Sub8_Sub1) this.aClass39_11.method1270();
			while (true) {
				if (local21 == null) {
					break;
				}
				if (local21.aLong259 == (long) arg1 && local21.aClass294_6 == arg0 && local21.anInt5577 == 2) {
					local7.aByteArray65 = local21.aByteArray65;
					local7.aBoolean781 = false;
					return local7;
				}
				local21 = (Class3_Sub4_Sub8_Sub1) this.aClass39_11.method1275();
			}
		}
		local7.aByteArray65 = arg0.method7262(arg1);
		local7.aBoolean781 = false;
		local7.aBoolean780 = true;
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!sd;IB)Lclient!kaa;")
	public Class3_Sub4_Sub8_Sub1 method8177(@OriginalArg(0) Class294 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class3_Sub4_Sub8_Sub1 local7 = new Class3_Sub4_Sub8_Sub1();
		local7.aClass294_6 = arg0;
		local7.aBoolean780 = false;
		local7.aLong259 = arg1;
		local7.anInt5577 = 3;
		this.method8183(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!sd;[BI)Lclient!kaa;")
	public Class3_Sub4_Sub8_Sub1 method8178(@OriginalArg(0) int arg0, @OriginalArg(1) Class294 arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) Class3_Sub4_Sub8_Sub1 local7 = new Class3_Sub4_Sub8_Sub1();
		local7.aByteArray65 = arg2;
		local7.anInt5577 = 2;
		local7.aClass294_6 = arg1;
		local7.aLong259 = arg0;
		local7.aBoolean780 = false;
		this.method8183(local7);
		return local7;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method8179() {
		this.aBoolean837 = true;
		@Pc(9) Class39 local9 = this.aClass39_11;
		synchronized (this.aClass39_11) {
			this.aClass39_11.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!wb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean837) {
			@Pc(6) Class39 local6 = this.aClass39_11;
			@Pc(14) Class3_Sub4_Sub8_Sub1 local14;
			synchronized (this.aClass39_11) {
				local14 = (Class3_Sub4_Sub8_Sub1) this.aClass39_11.method1276();
				if (local14 == null) {
					try {
						this.aClass39_11.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt10080--;
			}
			try {
				if (local14.anInt5577 == 2) {
					local14.aClass294_6.method7260(local14.aByteArray65, local14.aByteArray65.length, (int) local14.aLong259);
				} else if (local14.anInt5577 == 3) {
					local14.aByteArray65 = local14.aClass294_6.method7262((int) local14.aLong259);
				}
			} catch (@Pc(74) Exception local74) {
				Static468.method7192(null, local74);
			}
			local14.aBoolean781 = false;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLclient!kaa;)V")
	private void method8183(@OriginalArg(1) Class3_Sub4_Sub8_Sub1 arg0) {
		@Pc(2) Class39 local2 = this.aClass39_11;
		synchronized (this.aClass39_11) {
			this.aClass39_11.method1273(arg0);
			this.anInt10080++;
			this.aClass39_11.notifyAll();
		}
	}
}
