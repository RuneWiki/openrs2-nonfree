import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class115 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "[I")
	public static final int[] anIntArray188 = new int[50];

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "Lclient!tl;")
	private Class2_Sub2 aClass2_Sub2_25;

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	private final int anInt2958;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "[Lclient!tl;")
	private final Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V", line = 164)
	public Class115(@OriginalArg(0) int arg0) {
		this.anInt2958 = arg0;
		this.aClass2_Sub2Array1 = new Class2_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[local10] = new Class2_Sub2();
			local20.aClass2_Sub2_51 = local20;
			local20.aClass2_Sub2_52 = local20;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJ)Lclient!tl;", line = 9)
	public Class2_Sub2 method2975(@OriginalArg(1) long arg0) {
		this.aLong92 = arg0;
		@Pc(26) Class2_Sub2 local26 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt2958 - 1))];
		for (this.aClass2_Sub2_25 = local26.aClass2_Sub2_51; this.aClass2_Sub2_25 != local26; this.aClass2_Sub2_25 = this.aClass2_Sub2_25.aClass2_Sub2_51) {
			if (this.aClass2_Sub2_25.aLong215 == arg0) {
				@Pc(41) Class2_Sub2 local41 = this.aClass2_Sub2_25;
				this.aClass2_Sub2_25 = this.aClass2_Sub2_25.aClass2_Sub2_51;
				return local41;
			}
		}
		this.aClass2_Sub2_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Lclient!tl;", line = 55)
	public Class2_Sub2 method2976() {
		if (this.aClass2_Sub2_25 == null) {
			return null;
		}
		@Pc(28) Class2_Sub2 local28 = this.aClass2_Sub2Array1[(int) ((long) (this.anInt2958 - 1) & this.aLong92)];
		while (local28 != this.aClass2_Sub2_25) {
			if (this.aLong92 == this.aClass2_Sub2_25.aLong215) {
				@Pc(40) Class2_Sub2 local40 = this.aClass2_Sub2_25;
				this.aClass2_Sub2_25 = this.aClass2_Sub2_25.aClass2_Sub2_51;
				return local40;
			}
			this.aClass2_Sub2_25 = this.aClass2_Sub2_25.aClass2_Sub2_51;
		}
		this.aClass2_Sub2_25 = null;
		return null;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IJLclient!tl;)V", line = 121)
	public void method2979(@OriginalArg(1) long arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg1.aClass2_Sub2_52 != null) {
			arg1.method6144();
		}
		@Pc(21) Class2_Sub2 local21 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt2958 - 1))];
		arg1.aClass2_Sub2_52 = local21.aClass2_Sub2_52;
		arg1.aClass2_Sub2_51 = local21;
		arg1.aClass2_Sub2_52.aClass2_Sub2_51 = arg1;
		arg1.aClass2_Sub2_51.aClass2_Sub2_52 = arg1;
		arg1.aLong215 = arg0;
	}
}
