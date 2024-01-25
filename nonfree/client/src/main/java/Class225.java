import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class225 {

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!lj;")
	private final Class187 aClass187_8 = new Class187();

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	private final int anInt6785;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	private int anInt6773;

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!cb;")
	private final Class42 aClass42_26;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
	public Class225(@OriginalArg(0) int arg0) {
		this.anInt6785 = arg0;
		this.anInt6773 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass42_26 = new Class42(local16);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!vp;ILjava/lang/Object;)V")
	public void method5536(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) Object arg1) {
		this.method5543(arg1, arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!ida;)V")
	private void method5537(@OriginalArg(1) Class5_Sub2_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method7425();
			arg0.method7323();
			this.anInt6773 += arg0.anInt5075;
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
	public void method5538() {
		if (Static494.aClass192_1 == null) {
			return;
		}
		for (@Pc(19) Class5_Sub2_Sub3 local19 = (Class5_Sub2_Sub3) this.aClass187_8.method4805(); local19 != null; local19 = (Class5_Sub2_Sub3) this.aClass187_8.method4810()) {
			if (local19.method4279()) {
				if (local19.method4277() == null) {
					local19.method7425();
					local19.method7323();
					this.anInt6773 += local19.anInt5075;
				}
			} else if (++local19.aLong252 > (long) 5) {
				@Pc(62) Class5_Sub2_Sub3 local62 = Static494.aClass192_1.method6013(local19);
				this.aClass42_26.method1106(local19.aLong253, local62);
				Static394.method5747(local19, local62);
				local19.method7425();
				local19.method7323();
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
	public int method5539() {
		return this.anInt6773;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public void method5540() {
		for (@Pc(19) Class5_Sub2_Sub3 local19 = (Class5_Sub2_Sub3) this.aClass187_8.method4805(); local19 != null; local19 = (Class5_Sub2_Sub3) this.aClass187_8.method4810()) {
			if (local19.method4279()) {
				local19.method7425();
				local19.method7323();
				this.anInt6773 += local19.anInt5075;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!vp;I)V")
	private void method5541(@OriginalArg(0) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method4836();
		for (@Pc(18) Class5_Sub2_Sub3 local18 = (Class5_Sub2_Sub3) this.aClass42_26.method1109(local9); local18 != null; local18 = (Class5_Sub2_Sub3) this.aClass42_26.method1110()) {
			if (local18.anInterface18_3.method4835(arg0)) {
				this.method5537(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
	public void method5542() {
		this.aClass187_8.method4808();
		this.aClass42_26.method1108();
		this.anInt6773 = this.anInt6785;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLjava/lang/Object;ILclient!vp;)V")
	private void method5543(@OriginalArg(1) Object arg0, @OriginalArg(3) Interface18 arg1) {
		if (this.anInt6785 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method5541(arg1);
		this.anInt6773--;
		while (this.anInt6773 < 0) {
			@Pc(36) Class5_Sub2_Sub3 local36 = (Class5_Sub2_Sub3) this.aClass187_8.method4802();
			this.method5537(local36);
		}
		@Pc(53) Class5_Sub2_Sub3_Sub2 local53 = new Class5_Sub2_Sub3_Sub2(arg1, arg0, 1);
		this.aClass42_26.method1106(arg1.method4836(), local53);
		this.aClass187_8.method4807(local53);
		local53.aLong252 = 0L;
	}

	@OriginalMember(owner = "client!op", name = "d", descriptor = "(I)I")
	public int method5544() {
		return this.anInt6785;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(BLclient!vp;)Ljava/lang/Object;")
	public Object method5545(@OriginalArg(1) Interface18 arg0) {
		@Pc(9) long local9 = arg0.method4836();
		for (@Pc(22) Class5_Sub2_Sub3 local22 = (Class5_Sub2_Sub3) this.aClass42_26.method1109(local9); local22 != null; local22 = (Class5_Sub2_Sub3) this.aClass42_26.method1110()) {
			if (local22.anInterface18_3.method4835(arg0)) {
				@Pc(34) Object local34 = local22.method4277();
				if (local34 != null) {
					if (local22.method4279()) {
						@Pc(73) Class5_Sub2_Sub3_Sub2 local73 = new Class5_Sub2_Sub3_Sub2(arg0, local34, local22.anInt5075);
						this.aClass42_26.method1106(local22.aLong253, local73);
						this.aClass187_8.method4807(local73);
						local73.aLong252 = 0L;
						local22.method7425();
						local22.method7323();
					} else {
						this.aClass187_8.method4807(local22);
						local22.aLong252 = 0L;
					}
					return local34;
				}
				local22.method7425();
				local22.method7323();
				this.anInt6773 += local22.anInt5075;
			}
		}
		return null;
	}
}
