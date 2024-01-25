import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rs")
public final class Class291 implements Runnable {

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "Lclient!ce;")
	private final Class49 aClass49_8 = new Class49();

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public int anInt8181 = 0;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread6;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!k;)V")
	public Class291(@OriginalArg(0) Class168 arg0) {
		@Pc(20) Class309 local20 = arg0.method4091(this, 5);
		while (local20.anInt8650 == 0) {
			Static373.method5240(10L);
		}
		if (local20.anInt8650 == 2) {
			throw new RuntimeException();
		}
		this.aThread6 = (Thread) local20.anObject15;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!mu;I)Lclient!uu;")
	public Class3_Sub7_Sub5_Sub2 method6418(@OriginalArg(0) int arg0, @OriginalArg(1) Class215 arg1) {
		@Pc(7) Class3_Sub7_Sub5_Sub2 local7 = new Class3_Sub7_Sub5_Sub2();
		local7.aLong263 = arg0;
		local7.aClass215_10 = arg1;
		local7.anInt9661 = 3;
		local7.aBoolean638 = false;
		this.method6423(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!mu;IZ)Lclient!uu;")
	public Class3_Sub7_Sub5_Sub2 method6419(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub7_Sub5_Sub2 local9 = new Class3_Sub7_Sub5_Sub2();
		local9.anInt9661 = 1;
		@Pc(15) Class49 local15 = this.aClass49_8;
		synchronized (this.aClass49_8) {
			@Pc(23) Class3_Sub7_Sub5_Sub2 local23 = (Class3_Sub7_Sub5_Sub2) this.aClass49_8.method1448();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong263 == (long) arg1 && arg0 == local23.aClass215_10 && local23.anInt9661 == 2) {
					local9.aBoolean636 = false;
					local9.aByteArray232 = local23.aByteArray232;
					return local9;
				}
				local23 = (Class3_Sub7_Sub5_Sub2) this.aClass49_8.method1451();
			}
		}
		local9.aByteArray232 = arg0.method5012(arg1);
		local9.aBoolean638 = true;
		local9.aBoolean636 = false;
		return local9;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public void method6420() {
		this.aBoolean562 = true;
		@Pc(9) Class49 local9 = this.aClass49_8;
		synchronized (this.aClass49_8) {
			this.aClass49_8.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
		this.aThread6 = null;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([BIILclient!mu;)Lclient!uu;")
	public Class3_Sub7_Sub5_Sub2 method6422(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class215 arg2) {
		@Pc(7) Class3_Sub7_Sub5_Sub2 local7 = new Class3_Sub7_Sub5_Sub2();
		local7.anInt9661 = 2;
		local7.aByteArray232 = arg0;
		local7.aBoolean638 = false;
		local7.aClass215_10 = arg2;
		local7.aLong263 = arg1;
		this.method6423(local7);
		return local7;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!uu;I)V")
	private void method6423(@OriginalArg(0) Class3_Sub7_Sub5_Sub2 arg0) {
		@Pc(6) Class49 local6 = this.aClass49_8;
		synchronized (this.aClass49_8) {
			this.aClass49_8.method1455(arg0);
			this.anInt8181++;
			this.aClass49_8.notifyAll();
		}
	}

	@OriginalMember(owner = "client!rs", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean562) {
			@Pc(6) Class49 local6 = this.aClass49_8;
			@Pc(14) Class3_Sub7_Sub5_Sub2 local14;
			synchronized (this.aClass49_8) {
				local14 = (Class3_Sub7_Sub5_Sub2) this.aClass49_8.method1452();
				if (local14 == null) {
					try {
						this.aClass49_8.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt8181--;
			}
			try {
				if (local14.anInt9661 == 2) {
					local14.aClass215_10.method5015(local14.aByteArray232, local14.aByteArray232.length, (int) local14.aLong263);
				} else if (local14.anInt9661 == 3) {
					local14.aByteArray232 = local14.aClass215_10.method5012((int) local14.aLong263);
				}
			} catch (@Pc(72) Exception local72) {
				Static332.method1390(local72, null);
			}
			local14.aBoolean636 = false;
		}
	}
}
