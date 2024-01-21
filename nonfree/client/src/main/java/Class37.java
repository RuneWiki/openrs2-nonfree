import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class37 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	public static int[] anIntArray207 = new int[99];

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!wb;")
	private final Class1_Sub1 aClass1_Sub1_32 = new Class1_Sub1();

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!b;")
	private final Class5 aClass5_2 = new Class5();

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
	private final int anInt1395;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	private int anInt1396;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!mb;")
	private final Class41 aClass41_4;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 99; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray207[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class37(@OriginalArg(0) int arg0) {
		this.anInt1395 = arg0;
		this.anInt1396 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass41_4 = new Class41(local19);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public void method976() {
		while (true) {
			@Pc(8) Class1_Sub1 local8 = this.aClass5_2.method108();
			if (local8 == null) {
				this.anInt1396 = this.anInt1395;
				return;
			}
			local8.method1825();
			local8.method1828();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JB)V")
	public void method978(@OriginalArg(0) long arg0) {
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) this.aClass41_4.method1020(arg0);
		if (local16 != null) {
			local16.method1825();
			local16.method1828();
			this.anInt1396++;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JLclient!wb;I)V")
	public void method981(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (this.anInt1396 == 0) {
			@Pc(18) Class1_Sub1 local18 = this.aClass5_2.method108();
			local18.method1825();
			local18.method1828();
			if (local18 == this.aClass1_Sub1_32) {
				local18 = this.aClass5_2.method108();
				local18.method1825();
				local18.method1828();
			}
		} else {
			this.anInt1396--;
		}
		this.aClass41_4.method1019(arg0, arg1);
		this.aClass5_2.method110(arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JI)Lclient!wb;")
	public Class1_Sub1 method982(@OriginalArg(0) long arg0) {
		@Pc(18) Class1_Sub1 local18 = (Class1_Sub1) this.aClass41_4.method1020(arg0);
		if (local18 != null) {
			this.aClass5_2.method110(local18);
		}
		return local18;
	}
}
