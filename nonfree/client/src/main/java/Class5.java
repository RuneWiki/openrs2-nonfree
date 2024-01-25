import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!vi;")
	private final Class248 aClass248_1 = new Class248();

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
	private int anInt112;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
	private final int anInt105;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!jr;")
	private final Class127 aClass127_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		this.anInt112 = arg0;
		this.anInt105 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass127_1 = new Class127(local14);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JB)Ljava/lang/Object;")
	public Object method104(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub3_Sub9 local10 = (Class3_Sub3_Sub9) this.aClass127_1.method3246(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method3515();
		if (local18 == null) {
			local10.method5987();
			local10.method4647();
			this.anInt112 += local10.anInt4306;
			return null;
		}
		if (local10.method3512()) {
			@Pc(61) Class3_Sub3_Sub9_Sub2 local61 = new Class3_Sub3_Sub9_Sub2(local18, local10.anInt4306);
			this.aClass127_1.method3257(local10.aLong227, local61);
			this.aClass248_1.method5659(local61);
			local61.aLong175 = 0L;
			local10.method5987();
			local10.method4647();
		} else {
			this.aClass248_1.method5659(local10);
			local10.aLong175 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
	public int method105() {
		return this.anInt105;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public void method106(@OriginalArg(1) int arg0) {
		if (Static257.aClass24_1 == null) {
			return;
		}
		for (@Pc(11) Class3_Sub3_Sub9 local11 = (Class3_Sub3_Sub9) this.aClass248_1.method5661(); local11 != null; local11 = (Class3_Sub3_Sub9) this.aClass248_1.method5657()) {
			if (local11.method3512()) {
				if (local11.method3515() == null) {
					local11.method5987();
					local11.method4647();
					this.anInt112++;
				}
			} else if (++local11.aLong175 > (long) arg0) {
				@Pc(32) Class3_Sub3_Sub9 local32 = Static257.aClass24_1.method4614(local11);
				this.aClass127_1.method3257(local11.aLong227, local32);
				Static180.method3065(local32, local11);
				local11.method5987();
				local11.method4647();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public Object method108() {
		@Pc(16) Class3_Sub3_Sub9 local16 = (Class3_Sub3_Sub9) this.aClass127_1.method3252();
		while (local16 != null) {
			@Pc(22) Object local22 = local16.method3515();
			if (local22 != null) {
				return local22;
			}
			@Pc(26) Class3_Sub3_Sub9 local26 = local16;
			local16 = (Class3_Sub3_Sub9) this.aClass127_1.method3252();
			local26.method5987();
			local26.method4647();
			this.anInt112 += local16.anInt4306;
		}
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
	private void method109(@OriginalArg(0) long arg0) {
		@Pc(10) Class3_Sub3_Sub9 local10 = (Class3_Sub3_Sub9) this.aClass127_1.method3246(arg0);
		this.method113(local10);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public void method110() {
		for (@Pc(13) Class3_Sub3_Sub9 local13 = (Class3_Sub3_Sub9) this.aClass248_1.method5661(); local13 != null; local13 = (Class3_Sub3_Sub9) this.aClass248_1.method5657()) {
			if (local13.method3512()) {
				local13.method5987();
				local13.method4647();
				this.anInt112 += local13.anInt4306;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)I")
	public int method111() {
		return this.anInt112;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)I")
	public int method112() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) Class3_Sub3_Sub9 local11 = (Class3_Sub3_Sub9) this.aClass248_1.method5661(); local11 != null; local11 = (Class3_Sub3_Sub9) this.aClass248_1.method5657()) {
			if (!local11.method3512()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!jo;I)V")
	private void method113(@OriginalArg(0) Class3_Sub3_Sub9 arg0) {
		if (arg0 != null) {
			arg0.method5987();
			arg0.method4647();
			this.anInt112 += arg0.anInt4306;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JILjava/lang/Object;)V")
	public void method114(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method115(arg1, arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
	private void method115(@OriginalArg(2) Object arg0, @OriginalArg(3) long arg1) {
		if (this.anInt105 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method109(arg1);
		this.anInt112--;
		while (this.anInt112 < 0) {
			@Pc(29) Class3_Sub3_Sub9 local29 = (Class3_Sub3_Sub9) this.aClass248_1.method5662();
			this.method113(local29);
		}
		@Pc(47) Class3_Sub3_Sub9_Sub2 local47 = new Class3_Sub3_Sub9_Sub2(arg0, 1);
		this.aClass127_1.method3257(arg1, local47);
		this.aClass248_1.method5659(local47);
		local47.aLong175 = 0L;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
	public void method116() {
		this.aClass248_1.method5663();
		this.aClass127_1.method3249();
		this.anInt112 = this.anInt105;
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public Object method117() {
		@Pc(13) Class3_Sub3_Sub9 local13 = (Class3_Sub3_Sub9) this.aClass127_1.method3248();
		while (local13 != null) {
			@Pc(19) Object local19 = local13.method3515();
			if (local19 != null) {
				return local19;
			}
			@Pc(23) Class3_Sub3_Sub9 local23 = local13;
			local13 = (Class3_Sub3_Sub9) this.aClass127_1.method3252();
			local23.method5987();
			local23.method4647();
			this.anInt112 += local13.anInt4306;
		}
		return null;
	}
}
