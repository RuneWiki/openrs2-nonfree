import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class48 {

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!hb;")
	private final Class8_Sub1 aClass8_Sub1_43 = new Class8_Sub1();

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "Lclient!pb;")
	private final Class60 aClass60_1 = new Class60();

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "I")
	private int anInt1810;

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
	private final int anInt1808;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "Lclient!af;")
	private final Class7 aClass7_12;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class48(@OriginalArg(0) int arg0) {
		this.anInt1810 = arg0;
		this.anInt1808 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass7_12 = new Class7(local19);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)V")
	public void method1096(@OriginalArg(1) long arg0) {
		@Pc(16) Class8_Sub1 local16 = (Class8_Sub1) this.aClass7_12.method45(arg0);
		if (local16 != null) {
			local16.method2013();
			local16.method1952();
			this.anInt1810++;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILclient!hb;J)V")
	public void method1097(@OriginalArg(1) Class8_Sub1 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt1810 == 0) {
			@Pc(14) Class8_Sub1 local14 = this.aClass60_1.method1350();
			local14.method2013();
			local14.method1952();
			if (this.aClass8_Sub1_43 == local14) {
				local14 = this.aClass60_1.method1350();
				local14.method2013();
				local14.method1952();
			}
		} else {
			this.anInt1810--;
		}
		this.aClass7_12.method48(arg0, arg1);
		this.aClass60_1.method1356(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JI)Lclient!hb;")
	public Class8_Sub1 method1100(@OriginalArg(0) long arg0) {
		@Pc(18) Class8_Sub1 local18 = (Class8_Sub1) this.aClass7_12.method45(arg0);
		if (local18 != null) {
			this.aClass60_1.method1356(local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
	public void method1101() {
		while (true) {
			@Pc(13) Class8_Sub1 local13 = this.aClass60_1.method1350();
			if (local13 == null) {
				this.anInt1810 = this.anInt1808;
				return;
			}
			local13.method2013();
			local13.method1952();
		}
	}
}
