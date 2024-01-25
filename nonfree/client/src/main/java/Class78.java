import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!tr;")
	private final Class195 aClass195_2 = new Class195();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
	public int anInt2365 = 0;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!de;)V")
	public Class78(@OriginalArg(0) Class42 arg0) {
		@Pc(20) Class207 local20 = arg0.method972(this, 5);
		while (local20.anInt6346 == 0) {
			Static134.method2241(10L);
		}
		if (local20.anInt6346 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject7;
	}

	@OriginalMember(owner = "client!ha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean123) {
			@Pc(10) Class195 local10 = this.aClass195_2;
			@Pc(18) Class3_Sub7_Sub17_Sub1 local18;
			synchronized (this.aClass195_2) {
				local18 = (Class3_Sub7_Sub17_Sub1) this.aClass195_2.method5208();
				if (local18 == null) {
					try {
						this.aClass195_2.wait();
					} catch (@Pc(25) InterruptedException local25) {
					}
					continue;
				}
				this.anInt2365--;
			}
			try {
				if (local18.anInt4622 == 2) {
					local18.aClass55_2.method1162(local18.aByteArray73.length, (int) local18.aLong198, local18.aByteArray73);
				} else if (local18.anInt4622 == 3) {
					local18.aByteArray73 = local18.aClass55_2.method1164((int) local18.aLong198);
				}
			} catch (@Pc(74) Exception local74) {
				Static69.method1091(null, local74);
			}
			local18.aBoolean300 = false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[BLclient!eg;)Lclient!oo;")
	public Class3_Sub7_Sub17_Sub1 method1935(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(7) Class3_Sub7_Sub17_Sub1 local7 = new Class3_Sub7_Sub17_Sub1();
		local7.aBoolean299 = false;
		local7.aByteArray73 = arg1;
		local7.aLong198 = arg0;
		local7.aClass55_2 = arg2;
		local7.anInt4622 = 2;
		this.method1937(local7);
		return local7;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!eg;)Lclient!oo;")
	public Class3_Sub7_Sub17_Sub1 method1936(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(9) Class3_Sub7_Sub17_Sub1 local9 = new Class3_Sub7_Sub17_Sub1();
		local9.anInt4622 = 1;
		@Pc(15) Class195 local15 = this.aClass195_2;
		synchronized (this.aClass195_2) {
			@Pc(23) Class3_Sub7_Sub17_Sub1 local23 = (Class3_Sub7_Sub17_Sub1) this.aClass195_2.method5216();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong198 == (long) arg0 && arg1 == local23.aClass55_2 && local23.anInt4622 == 2) {
					local9.aByteArray73 = local23.aByteArray73;
					local9.aBoolean300 = false;
					return local9;
				}
				local23 = (Class3_Sub7_Sub17_Sub1) this.aClass195_2.method5210();
			}
		}
		local9.aByteArray73 = arg1.method1164(arg0);
		local9.aBoolean300 = false;
		local9.aBoolean299 = true;
		return local9;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!oo;)V")
	private void method1937(@OriginalArg(1) Class3_Sub7_Sub17_Sub1 arg0) {
		@Pc(2) Class195 local2 = this.aClass195_2;
		synchronized (this.aClass195_2) {
			this.aClass195_2.method5213(arg0);
			this.anInt2365++;
			this.aClass195_2.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IILclient!eg;)Lclient!oo;")
	public Class3_Sub7_Sub17_Sub1 method1938(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(13) Class3_Sub7_Sub17_Sub1 local13 = new Class3_Sub7_Sub17_Sub1();
		local13.aLong198 = arg0;
		local13.aBoolean299 = false;
		local13.aClass55_2 = arg1;
		local13.anInt4622 = 3;
		this.method1937(local13);
		return local13;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public void method1939() {
		this.aBoolean123 = true;
		@Pc(13) Class195 local13 = this.aClass195_2;
		synchronized (this.aClass195_2) {
			this.aClass195_2.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread2 = null;
	}
}
