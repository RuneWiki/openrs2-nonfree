import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class387 {

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!dha;")
	private final Class73 aClass73_12 = new Class73();

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	private final int anInt11075;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	private int anInt11076;

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Lclient!jo;")
	private final Class187 aClass187_84;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	public Class387(@OriginalArg(0) int arg0) {
		this.anInt11075 = arg0;
		this.anInt11076 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass187_84 = new Class187(local16);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!dr;B)V")
	private void method9220(@OriginalArg(0) Interface5 arg0) {
		@Pc(15) long local15 = arg0.method3199();
		for (@Pc(22) Class14_Sub3_Sub3 local22 = (Class14_Sub3_Sub3) this.aClass187_84.method4078(local15); local22 != null; local22 = (Class14_Sub3_Sub3) this.aClass187_84.method4086()) {
			if (local22.anInterface5_3.method3198(arg0)) {
				this.method9227(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)V")
	public void method9221() {
		if (Static330.aClass189_1 == null) {
			return;
		}
		for (@Pc(15) Class14_Sub3_Sub3 local15 = (Class14_Sub3_Sub3) this.aClass73_12.method1826(); local15 != null; local15 = (Class14_Sub3_Sub3) this.aClass73_12.method1827()) {
			if (local15.method5210()) {
				if (local15.method5212() == null) {
					local15.method9315();
					local15.method9253();
					this.anInt11076 += local15.anInt6296;
				}
			} else if ((long) 5 < ++local15.aLong302) {
				@Pc(41) Class14_Sub3_Sub3 local41 = Static330.aClass189_1.method6798(local15);
				this.aClass187_84.method4077(local15.aLong305, local41);
				Static54.method1181(local15, local41);
				local15.method9315();
				local15.method9253();
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V")
	public void method9222() {
		for (@Pc(11) Class14_Sub3_Sub3 local11 = (Class14_Sub3_Sub3) this.aClass73_12.method1826(); local11 != null; local11 = (Class14_Sub3_Sub3) this.aClass73_12.method1827()) {
			if (local11.method5210()) {
				local11.method9315();
				local11.method9253();
				this.anInt11076 += local11.anInt6296;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!dr;ZILjava/lang/Object;)V")
	private void method9223(@OriginalArg(0) Interface5 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt11075 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method9220(arg0);
		this.anInt11076--;
		while (this.anInt11076 < 0) {
			@Pc(40) Class14_Sub3_Sub3 local40 = (Class14_Sub3_Sub3) this.aClass73_12.method1823();
			this.method9227(local40);
		}
		@Pc(54) Class14_Sub3_Sub3_Sub2 local54 = new Class14_Sub3_Sub3_Sub2(arg0, arg1, 1);
		this.aClass187_84.method4077(arg0.method3199(), local54);
		this.aClass73_12.method1816(local54);
		local54.aLong302 = 0L;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method9226() {
		this.aClass73_12.method1819();
		this.aClass187_84.method4076();
		this.anInt11076 = this.anInt11075;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLclient!kca;)V")
	private void method9227(@OriginalArg(1) Class14_Sub3_Sub3 arg0) {
		if (arg0 != null) {
			arg0.method9315();
			arg0.method9253();
			this.anInt11076 += arg0.anInt6296;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/Object;Lclient!dr;I)V")
	public void method9228(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface5 arg1) {
		this.method9223(arg1, arg0);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
	public int method9229() {
		return this.anInt11076;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)I")
	public int method9231() {
		return this.anInt11075;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!dr;)Ljava/lang/Object;")
	public Object method9232(@OriginalArg(1) Interface5 arg0) {
		@Pc(9) long local9 = arg0.method3199();
		for (@Pc(22) Class14_Sub3_Sub3 local22 = (Class14_Sub3_Sub3) this.aClass187_84.method4078(local9); local22 != null; local22 = (Class14_Sub3_Sub3) this.aClass187_84.method4086()) {
			if (local22.anInterface5_3.method3198(arg0)) {
				@Pc(34) Object local34 = local22.method5212();
				if (local34 != null) {
					if (local22.method5210()) {
						@Pc(63) Class14_Sub3_Sub3_Sub2 local63 = new Class14_Sub3_Sub3_Sub2(arg0, local34, local22.anInt6296);
						this.aClass187_84.method4077(local22.aLong305, local63);
						this.aClass73_12.method1816(local63);
						local63.aLong302 = 0L;
						local22.method9315();
						local22.method9253();
					} else {
						this.aClass73_12.method1816(local22);
						local22.aLong302 = 0L;
					}
					return local34;
				}
				local22.method9315();
				local22.method9253();
				this.anInt11076 += local22.anInt6296;
			}
		}
		return null;
	}
}
