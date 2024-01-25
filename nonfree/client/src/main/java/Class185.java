import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class185 implements Runnable {

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Lclient!ro;")
	private final Class176 aClass176_9 = new Class176();

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public int anInt5612 = 0;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/Thread;")
	private Thread aThread3;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!am;)V")
	public Class185(@OriginalArg(0) Class10 arg0) {
		@Pc(20) Class60 local20 = arg0.method316(5, this);
		while (local20.anInt1838 == 0) {
			Static105.method2138(10L);
		}
		if (local20.anInt1838 == 2) {
			throw new RuntimeException();
		}
		this.aThread3 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public void method4967() {
		this.aBoolean422 = true;
		@Pc(13) Class176 local13 = this.aClass176_9;
		synchronized (this.aClass176_9) {
			this.aClass176_9.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
		this.aThread3 = null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLclient!wq;)Lclient!ds;")
	public Class5_Sub9_Sub3_Sub1 method4970(@OriginalArg(0) int arg0, @OriginalArg(2) Class219 arg1) {
		@Pc(12) Class5_Sub9_Sub3_Sub1 local12 = new Class5_Sub9_Sub3_Sub1();
		local12.anInt1551 = 3;
		local12.aClass219_1 = arg1;
		local12.aBoolean410 = false;
		local12.aLong208 = arg0;
		this.method4973(local12);
		return local12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BIILclient!wq;)Lclient!ds;")
	public Class5_Sub9_Sub3_Sub1 method4972(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class219 arg2) {
		@Pc(12) Class5_Sub9_Sub3_Sub1 local12 = new Class5_Sub9_Sub3_Sub1();
		local12.aClass219_1 = arg2;
		local12.aByteArray16 = arg0;
		local12.anInt1551 = 2;
		local12.aLong208 = arg1;
		local12.aBoolean410 = false;
		this.method4973(local12);
		return local12;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!ds;B)V")
	private void method4973(@OriginalArg(0) Class5_Sub9_Sub3_Sub1 arg0) {
		@Pc(2) Class176 local2 = this.aClass176_9;
		synchronized (this.aClass176_9) {
			this.aClass176_9.method4772(arg0);
			this.anInt5612++;
			this.aClass176_9.notifyAll();
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!wq;I)Lclient!ds;")
	public Class5_Sub9_Sub3_Sub1 method4974(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1) {
		@Pc(9) Class5_Sub9_Sub3_Sub1 local9 = new Class5_Sub9_Sub3_Sub1();
		local9.anInt1551 = 1;
		@Pc(15) Class176 local15 = this.aClass176_9;
		synchronized (this.aClass176_9) {
			@Pc(23) Class5_Sub9_Sub3_Sub1 local23 = (Class5_Sub9_Sub3_Sub1) this.aClass176_9.method4768();
			while (true) {
				if (local23 == null) {
					break;
				}
				if (local23.aLong208 == (long) arg0 && arg1 == local23.aClass219_1 && local23.anInt1551 == 2) {
					local9.aByteArray16 = local23.aByteArray16;
					local9.aBoolean408 = false;
					return local9;
				}
				local23 = (Class5_Sub9_Sub3_Sub1) this.aClass176_9.method4776();
			}
		}
		local9.aByteArray16 = arg1.method5827(arg0);
		local9.aBoolean410 = true;
		local9.aBoolean408 = false;
		return local9;
	}

	@OriginalMember(owner = "client!sj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean422) {
			@Pc(6) Class176 local6 = this.aClass176_9;
			@Pc(14) Class5_Sub9_Sub3_Sub1 local14;
			synchronized (this.aClass176_9) {
				local14 = (Class5_Sub9_Sub3_Sub1) this.aClass176_9.method4775();
				if (local14 == null) {
					try {
						this.aClass176_9.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt5612--;
			}
			try {
				if (local14.anInt1551 == 2) {
					local14.aClass219_1.method5831(local14.aByteArray16, (int) local14.aLong208, local14.aByteArray16.length);
				} else if (local14.anInt1551 == 3) {
					local14.aByteArray16 = local14.aClass219_1.method5827((int) local14.aLong208);
				}
			} catch (@Pc(74) Exception local74) {
				Static113.method2252(local74, null);
			}
			local14.aBoolean408 = false;
		}
	}
}
