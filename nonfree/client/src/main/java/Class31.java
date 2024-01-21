import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class31 {

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "J")
	private long aLong42;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "Lclient!aa;")
	private Class2 aClass2_51;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!aa;")
	private Class2 aClass2_52;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "I")
	private int anInt1240 = 0;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lclient!aa;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	private final int anInt1231;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		this.aClass2Array1 = new Class2[arg0];
		this.anInt1231 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_103 = local23;
			local23.aClass2_104 = local23;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZJ)Lclient!aa;")
	public Class2 method905(@OriginalArg(1) long arg0) {
		this.aLong42 = arg0;
		@Pc(14) Class2 local14 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt1231 - 1))];
		for (this.aClass2_51 = local14.aClass2_104; this.aClass2_51 != local14; this.aClass2_51 = this.aClass2_51.aClass2_104) {
			if (arg0 == this.aClass2_51.aLong89) {
				@Pc(36) Class2 local36 = this.aClass2_51;
				this.aClass2_51 = this.aClass2_51.aClass2_104;
				return local36;
			}
		}
		this.aClass2_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Lclient!aa;")
	public Class2 method907() {
		if (this.aClass2_51 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt1231 - 1) & this.aLong42)];
		while (local21 != this.aClass2_51) {
			if (this.aClass2_51.aLong89 == this.aLong42) {
				@Pc(32) Class2 local32 = this.aClass2_51;
				this.aClass2_51 = this.aClass2_51.aClass2_104;
				return local32;
			}
			this.aClass2_51 = this.aClass2_51.aClass2_104;
		}
		this.aClass2_51 = null;
		return null;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)Lclient!aa;")
	public Class2 method910() {
		this.anInt1240 = 0;
		return this.method911();
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)Lclient!aa;")
	public Class2 method911() {
		@Pc(27) Class2 local27;
		if (this.anInt1240 > 0 && this.aClass2Array1[this.anInt1240 - 1] != this.aClass2_52) {
			local27 = this.aClass2_52;
			this.aClass2_52 = local27.aClass2_104;
			return local27;
		}
		while (this.anInt1231 > this.anInt1240) {
			local27 = this.aClass2Array1[this.anInt1240++].aClass2_104;
			if (this.aClass2Array1[this.anInt1240 - 1] != local27) {
				this.aClass2_52 = local27.aClass2_104;
				return local27;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJLclient!aa;)V")
	public void method912(@OriginalArg(1) long arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_103 != null) {
			arg1.method2073();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt1231 - 1))];
		arg1.aLong89 = arg0;
		arg1.aClass2_104 = local21;
		arg1.aClass2_103 = local21.aClass2_103;
		arg1.aClass2_103.aClass2_104 = arg1;
		arg1.aClass2_104.aClass2_103 = arg1;
	}
}
