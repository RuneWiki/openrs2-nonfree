import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class58 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!fe;")
	private Class2 aClass2_85;

	@OriginalMember(owner = "client!oe", name = "y", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "Lclient!fe;")
	private Class2 aClass2_86;

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
	private int anInt1854 = 0;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "[Lclient!fe;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "I")
	private final int anInt1849;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(I)V")
	public Class58(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt1849 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_118 = local23;
			local23.aClass2_117 = local23;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JBLclient!fe;)V")
	public void method1301(@OriginalArg(0) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_118 != null) {
			arg1.method1930();
		}
		@Pc(26) Class2 local26 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt1849 - 1))];
		arg1.aClass2_118 = local26.aClass2_118;
		arg1.aClass2_117 = local26;
		arg1.aClass2_118.aClass2_117 = arg1;
		arg1.aLong96 = arg0;
		arg1.aClass2_117.aClass2_118 = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Lclient!fe;")
	public Class2 method1302() {
		@Pc(27) Class2 local27;
		if (this.anInt1854 > 0 && this.aClass2_86 != this.aClass2Array1[this.anInt1854 - 1]) {
			local27 = this.aClass2_86;
			this.aClass2_86 = local27.aClass2_117;
			return local27;
		}
		while (this.anInt1854 < this.anInt1849) {
			local27 = this.aClass2Array1[this.anInt1854++].aClass2_117;
			if (local27 != this.aClass2Array1[this.anInt1854 - 1]) {
				this.aClass2_86 = local27.aClass2_117;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lclient!fe;")
	public Class2 method1305() {
		this.anInt1854 = 0;
		return this.method1302();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lclient!fe;")
	public Class2 method1306() {
		if (this.aClass2_85 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1849 - 1) & this.aLong73)];
		while (this.aClass2_85 != local21) {
			if (this.aClass2_85.aLong96 == this.aLong73) {
				@Pc(36) Class2 local36 = this.aClass2_85;
				this.aClass2_85 = this.aClass2_85.aClass2_117;
				return local36;
			}
			this.aClass2_85 = this.aClass2_85.aClass2_117;
		}
		this.aClass2_85 = null;
		return null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(JI)Lclient!fe;")
	public Class2 method1307(@OriginalArg(0) long arg0) {
		this.aLong73 = arg0;
		@Pc(14) Class2 local14 = this.aClass2Array1[(int) ((long) (this.anInt1849 - 1) & arg0)];
		for (this.aClass2_85 = local14.aClass2_117; this.aClass2_85 != local14; this.aClass2_85 = this.aClass2_85.aClass2_117) {
			if (this.aClass2_85.aLong96 == arg0) {
				@Pc(37) Class2 local37 = this.aClass2_85;
				this.aClass2_85 = this.aClass2_85.aClass2_117;
				return local37;
			}
		}
		this.aClass2_85 = null;
		return null;
	}
}
