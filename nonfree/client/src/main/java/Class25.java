import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class25 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!i", name = "r", descriptor = "Lclient!nd;")
	private Class2 aClass2_49;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "Lclient!nd;")
	private Class2 aClass2_50;

	@OriginalMember(owner = "client!i", name = "x", descriptor = "I")
	private int anInt1458 = 0;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "I")
	private final int anInt1454;

	@OriginalMember(owner = "client!i", name = "s", descriptor = "[Lclient!nd;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt1454 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_97 = local23;
			local23.aClass2_98 = local23;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Lclient!nd;")
	public Class2 method989() {
		this.anInt1458 = 0;
		return this.method996();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!nd;BJ)V")
	public void method990(@OriginalArg(0) Class2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_98 != null) {
			arg0.method1820();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1454 - 1) & arg1)];
		arg0.aClass2_97 = local21;
		arg0.aLong96 = arg1;
		arg0.aClass2_98 = local21.aClass2_98;
		arg0.aClass2_98.aClass2_97 = arg0;
		arg0.aClass2_97.aClass2_98 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)Lclient!nd;")
	public Class2 method991(@OriginalArg(0) long arg0) {
		this.aLong44 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt1454 - 1) & arg0)];
		for (this.aClass2_49 = local23.aClass2_97; this.aClass2_49 != local23; this.aClass2_49 = this.aClass2_49.aClass2_97) {
			if (this.aClass2_49.aLong96 == arg0) {
				@Pc(37) Class2 local37 = this.aClass2_49;
				this.aClass2_49 = this.aClass2_49.aClass2_97;
				return local37;
			}
		}
		this.aClass2_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(I)Lclient!nd;")
	public Class2 method993() {
		if (this.aClass2_49 == null) {
			return null;
		}
		@Pc(27) Class2 local27 = this.aClass2Array1[(int) (this.aLong44 & (long) (this.anInt1454 - 1))];
		while (local27 != this.aClass2_49) {
			if (this.aClass2_49.aLong96 == this.aLong44) {
				@Pc(42) Class2 local42 = this.aClass2_49;
				this.aClass2_49 = this.aClass2_49.aClass2_97;
				return local42;
			}
			this.aClass2_49 = this.aClass2_49.aClass2_97;
		}
		this.aClass2_49 = null;
		return null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(B)Lclient!nd;")
	private Class2 method996() {
		@Pc(28) Class2 local28;
		if (this.anInt1458 > 0 && this.aClass2_50 != this.aClass2Array1[this.anInt1458 - 1]) {
			local28 = this.aClass2_50;
			this.aClass2_50 = local28.aClass2_97;
			return local28;
		}
		while (this.anInt1454 > this.anInt1458) {
			local28 = this.aClass2Array1[this.anInt1458++].aClass2_97;
			if (local28 != this.aClass2Array1[this.anInt1458 - 1]) {
				this.aClass2_50 = local28.aClass2_97;
				return local28;
			}
		}
		return null;
	}
}
