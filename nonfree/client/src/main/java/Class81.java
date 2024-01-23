import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!io", name = "e", descriptor = "Lclient!mg;")
	private Class108 aClass108_9 = new Class108();

	@OriginalMember(owner = "client!io", name = "r", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "I")
	public int anInt2638 = 0;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "()V")
	public Class81() {
		@Pc(20) Class47 local20 = Static142.aClass112_2.method2879(5, this);
		while (local20.anInt1417 == 0) {
			Static312.method4734(10L);
		}
		if (local20.anInt1417 == 2) {
			throw new RuntimeException();
		}
		this.aThread1 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IILclient!ja;)Lclient!dj;")
	public Class1_Sub3_Sub4_Sub1 method1964(@OriginalArg(0) int arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(5) Class1_Sub3_Sub4_Sub1 local5 = new Class1_Sub3_Sub4_Sub1();
		local5.anInt1175 = 1;
		@Pc(16) Class108 local16 = this.aClass108_9;
		synchronized (this.aClass108_9) {
			@Pc(23) Class1_Sub3_Sub4_Sub1 local23 = (Class1_Sub3_Sub4_Sub1) this.aClass108_9.method2754();
			while (true) {
				if (local23 == null) {
					break;
				}
				if ((long) arg0 == local23.aLong237 && arg1 == local23.aClass83_1 && local23.anInt1175 == 2) {
					local5.aBoolean275 = false;
					local5.aByteArray39 = local23.aByteArray39;
					return local5;
				}
				local23 = (Class1_Sub3_Sub4_Sub1) this.aClass108_9.method2751();
			}
		}
		local5.aByteArray39 = arg1.method2013(arg0);
		local5.aBoolean272 = true;
		local5.aBoolean275 = false;
		return local5;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!dj;I)V")
	private void method1965(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0) {
		@Pc(3) Class108 local3 = this.aClass108_9;
		synchronized (this.aClass108_9) {
			this.aClass108_9.method2753(arg0);
			this.anInt2638++;
			this.aClass108_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ja;[BII)Lclient!dj;")
	public Class1_Sub3_Sub4_Sub1 method1970(@OriginalArg(0) Class83 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class1_Sub3_Sub4_Sub1 local17 = new Class1_Sub3_Sub4_Sub1();
		local17.aBoolean272 = false;
		local17.aLong237 = arg2;
		local17.aByteArray39 = arg1;
		local17.anInt1175 = 2;
		local17.aClass83_1 = arg0;
		this.method1965(local17);
		return local17;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IILclient!ja;)Lclient!dj;")
	public Class1_Sub3_Sub4_Sub1 method1971(@OriginalArg(0) int arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(7) Class1_Sub3_Sub4_Sub1 local7 = new Class1_Sub3_Sub4_Sub1();
		local7.aClass83_1 = arg1;
		local7.aLong237 = arg0;
		local7.anInt1175 = 3;
		local7.aBoolean272 = false;
		this.method1965(local7);
		return local7;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	public void method1973() {
		this.aBoolean160 = true;
		@Pc(10) Class108 local10 = this.aClass108_9;
		synchronized (this.aClass108_9) {
			this.aClass108_9.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!io", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean160) {
			@Pc(12) Class108 local12 = this.aClass108_9;
			@Pc(19) Class1_Sub3_Sub4_Sub1 local19;
			synchronized (this.aClass108_9) {
				local19 = (Class1_Sub3_Sub4_Sub1) this.aClass108_9.method2756();
				if (local19 == null) {
					try {
						this.aClass108_9.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt2638--;
			}
			try {
				if (local19.anInt1175 == 2) {
					local19.aClass83_1.method2015((int) local19.aLong237, local19.aByteArray39, local19.aByteArray39.length);
				} else if (local19.anInt1175 == 3) {
					local19.aByteArray39 = local19.aClass83_1.method2013((int) local19.aLong237);
				}
			} catch (@Pc(82) Exception local82) {
				Static66.method3525(local82, null);
			}
			local19.aBoolean275 = false;
		}
	}
}
