import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class161 implements Runnable {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Lclient!vu;")
	private final Class368 aClass368_3 = new Class368();

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Z")
	private boolean aBoolean311 = false;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public int anInt4261 = 0;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Ljava/lang/Thread;")
	private Thread aThread5;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!fc;)V")
	public Class161(@OriginalArg(0) Class100 arg0) {
		@Pc(20) Class91 local20 = arg0.method2095(this, 5);
		while (local20.anInt2271 == 0) {
			Static314.method4821(10L);
		}
		if (local20.anInt2271 == 2) {
			throw new RuntimeException();
		}
		this.aThread5 = (Thread) local20.anObject2;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILclient!id;)Lclient!ob;")
	public Class5_Sub5_Sub8_Sub1 method3859(@OriginalArg(1) int arg0, @OriginalArg(2) Class157 arg1) {
		@Pc(15) Class5_Sub5_Sub8_Sub1 local15 = new Class5_Sub5_Sub8_Sub1();
		local15.anInt6451 = 3;
		local15.aLong274 = arg0;
		local15.aClass157_4 = arg1;
		local15.aBoolean707 = false;
		this.method3862(local15);
		return local15;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!ob;)V")
	private void method3862(@OriginalArg(1) Class5_Sub5_Sub8_Sub1 arg0) {
		@Pc(6) Class368 local6 = this.aClass368_3;
		synchronized (this.aClass368_3) {
			this.aClass368_3.method8709(arg0);
			this.anInt4261++;
			this.aClass368_3.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ih", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean311) {
			@Pc(6) Class368 local6 = this.aClass368_3;
			@Pc(14) Class5_Sub5_Sub8_Sub1 local14;
			synchronized (this.aClass368_3) {
				local14 = (Class5_Sub5_Sub8_Sub1) this.aClass368_3.method8705();
				if (local14 == null) {
					try {
						this.aClass368_3.wait();
					} catch (@Pc(29) InterruptedException local29) {
					}
					continue;
				}
				this.anInt4261--;
			}
			try {
				if (local14.anInt6451 == 2) {
					local14.aClass157_4.method3815(local14.aByteArray67, (int) local14.aLong274, local14.aByteArray67.length);
				} else if (local14.anInt6451 == 3) {
					local14.aByteArray67 = local14.aClass157_4.method3817((int) local14.aLong274);
				}
			} catch (@Pc(72) Exception local72) {
				Static524.method7740(local72, null);
			}
			local14.aBoolean706 = false;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!id;I)Lclient!ob;")
	public Class5_Sub5_Sub8_Sub1 method3863(@OriginalArg(0) int arg0, @OriginalArg(1) Class157 arg1) {
		@Pc(9) Class5_Sub5_Sub8_Sub1 local9 = new Class5_Sub5_Sub8_Sub1();
		local9.anInt6451 = 1;
		@Pc(15) Class368 local15 = this.aClass368_3;
		synchronized (this.aClass368_3) {
			@Pc(31) Class5_Sub5_Sub8_Sub1 local31 = (Class5_Sub5_Sub8_Sub1) this.aClass368_3.method8702();
			while (true) {
				if (local31 == null) {
					break;
				}
				if ((long) arg0 == local31.aLong274 && local31.aClass157_4 == arg1 && local31.anInt6451 == 2) {
					local9.aBoolean706 = false;
					local9.aByteArray67 = local31.aByteArray67;
					return local9;
				}
				local31 = (Class5_Sub5_Sub8_Sub1) this.aClass368_3.method8710();
			}
		}
		local9.aByteArray67 = arg1.method3817(arg0);
		local9.aBoolean707 = true;
		local9.aBoolean706 = false;
		return local9;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method3865() {
		this.aBoolean311 = true;
		@Pc(15) Class368 local15 = this.aClass368_3;
		synchronized (this.aClass368_3) {
			this.aClass368_3.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(31) InterruptedException local31) {
		}
		this.aThread5 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I[BLclient!id;I)Lclient!ob;")
	public Class5_Sub5_Sub8_Sub1 method3866(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class157 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class5_Sub5_Sub8_Sub1 local7 = new Class5_Sub5_Sub8_Sub1();
		local7.aByteArray67 = arg0;
		local7.aLong274 = arg2;
		local7.aClass157_4 = arg1;
		local7.anInt6451 = 2;
		local7.aBoolean707 = false;
		this.method3862(local7);
		return local7;
	}
}
