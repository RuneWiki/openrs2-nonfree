import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class38 {

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Lclient!cn;")
	private final Class44 aClass44_3 = new Class44();

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private final int anInt765;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt764;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "Lclient!mn;")
	private final Class163 aClass163_2;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt765 = arg0;
		this.anInt764 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass163_2 = new Class163(local16);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!jp;)V")
	private void method648(@OriginalArg(1) Class2_Sub5_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method5866();
			arg0.method5534();
			this.anInt764 += arg0.anInt6412;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	public void method650() {
		if (Static103.aClass109_1 == null) {
			return;
		}
		for (@Pc(21) Class2_Sub5_Sub9 local21 = (Class2_Sub5_Sub9) this.aClass44_3.method802(); local21 != null; local21 = (Class2_Sub5_Sub9) this.aClass44_3.method803()) {
			if (local21.method5075()) {
				if (local21.method5077() == null) {
					local21.method5866();
					local21.method5534();
					this.anInt764 += local21.anInt6412;
				}
			} else if (++local21.aLong211 > (long) 5) {
				@Pc(62) Class2_Sub5_Sub9 local62 = Static103.aClass109_1.method5186(local21);
				this.aClass163_2.method3764(local21.aLong227, local62);
				Static377.method5066(local62, local21);
				local21.method5866();
				local21.method5534();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!sl;I)V")
	private void method651(@OriginalArg(0) Interface11 arg0) {
		@Pc(9) long local9 = arg0.method732();
		for (@Pc(16) Class2_Sub5_Sub9 local16 = (Class2_Sub5_Sub9) this.aClass163_2.method3769(local9); local16 != null; local16 = (Class2_Sub5_Sub9) this.aClass163_2.method3765()) {
			if (local16.anInterface11_3.method731(arg0)) {
				this.method648(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)I")
	public int method652() {
		return this.anInt764;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public void method653() {
		this.aClass44_3.method807();
		this.aClass163_2.method3767();
		this.anInt764 = this.anInt765;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!sl;)Ljava/lang/Object;")
	public Object method654(@OriginalArg(1) Interface11 arg0) {
		@Pc(11) long local11 = arg0.method732();
		for (@Pc(25) Class2_Sub5_Sub9 local25 = (Class2_Sub5_Sub9) this.aClass163_2.method3769(local11); local25 != null; local25 = (Class2_Sub5_Sub9) this.aClass163_2.method3765()) {
			if (local25.anInterface11_3.method731(arg0)) {
				@Pc(37) Object local37 = local25.method5077();
				if (local37 != null) {
					if (local25.method5075()) {
						@Pc(76) Class2_Sub5_Sub9_Sub2 local76 = new Class2_Sub5_Sub9_Sub2(arg0, local37, local25.anInt6412);
						this.aClass163_2.method3764(local25.aLong227, local76);
						this.aClass44_3.method799(local76);
						local76.aLong211 = 0L;
						local25.method5866();
						local25.method5534();
					} else {
						this.aClass44_3.method799(local25);
						local25.aLong211 = 0L;
					}
					return local37;
				}
				local25.method5866();
				local25.method5534();
				this.anInt764 += local25.anInt6412;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!sl;IZLjava/lang/Object;)V")
	private void method655(@OriginalArg(0) Interface11 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt765 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method651(arg0);
		this.anInt764--;
		while (this.anInt764 < 0) {
			@Pc(41) Class2_Sub5_Sub9 local41 = (Class2_Sub5_Sub9) this.aClass44_3.method800();
			this.method648(local41);
		}
		@Pc(55) Class2_Sub5_Sub9_Sub2 local55 = new Class2_Sub5_Sub9_Sub2(arg0, arg1, 1);
		this.aClass163_2.method3764(arg0.method732(), local55);
		this.aClass44_3.method799(local55);
		local55.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!sl;Ljava/lang/Object;I)V")
	public void method656(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1) {
		this.method655(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public void method657() {
		for (@Pc(11) Class2_Sub5_Sub9 local11 = (Class2_Sub5_Sub9) this.aClass44_3.method802(); local11 != null; local11 = (Class2_Sub5_Sub9) this.aClass44_3.method803()) {
			if (local11.method5075()) {
				local11.method5866();
				local11.method5534();
				this.anInt764 += local11.anInt6412;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)I")
	public int method659() {
		return this.anInt765;
	}
}
