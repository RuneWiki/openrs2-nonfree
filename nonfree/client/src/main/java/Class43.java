import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class43 {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!de;")
	private Class3 aClass3_57;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Lclient!de;")
	private Class3 aClass3_58;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
	private int anInt1767 = 0;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	private final int anInt1760;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "[Lclient!de;")
	private final Class3[] aClass3Array1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		this.anInt1760 = arg0;
		this.aClass3Array1 = new Class3[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class3 local23 = this.aClass3Array1[local13] = new Class3();
			local23.aClass3_95 = local23;
			local23.aClass3_96 = local23;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)Lclient!de;")
	public Class3 method1079(@OriginalArg(0) long arg0) {
		this.aLong51 = arg0;
		@Pc(19) Class3 local19 = this.aClass3Array1[(int) ((long) (this.anInt1760 - 1) & arg0)];
		for (this.aClass3_57 = local19.aClass3_96; this.aClass3_57 != local19; this.aClass3_57 = this.aClass3_57.aClass3_96) {
			if (arg0 == this.aClass3_57.aLong81) {
				@Pc(41) Class3 local41 = this.aClass3_57;
				this.aClass3_57 = this.aClass3_57.aClass3_96;
				return local41;
			}
		}
		this.aClass3_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lclient!de;")
	private Class3 method1080() {
		@Pc(25) Class3 local25;
		if (this.anInt1767 > 0 && this.aClass3_58 != this.aClass3Array1[this.anInt1767 - 1]) {
			local25 = this.aClass3_58;
			this.aClass3_58 = local25.aClass3_96;
			return local25;
		}
		while (this.anInt1767 < this.anInt1760) {
			local25 = this.aClass3Array1[this.anInt1767++].aClass3_96;
			if (this.aClass3Array1[this.anInt1767 - 1] != local25) {
				this.aClass3_58 = local25.aClass3_96;
				return local25;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(JILclient!de;)V")
	public void method1081(@OriginalArg(0) long arg0, @OriginalArg(2) Class3 arg1) {
		if (arg1.aClass3_95 != null) {
			arg1.method1852();
		}
		@Pc(21) Class3 local21 = this.aClass3Array1[(int) ((long) (this.anInt1760 - 1) & arg0)];
		arg1.aClass3_95 = local21.aClass3_95;
		arg1.aLong81 = arg0;
		arg1.aClass3_96 = local21;
		arg1.aClass3_95.aClass3_96 = arg1;
		arg1.aClass3_96.aClass3_95 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)Lclient!de;")
	public Class3 method1086() {
		if (this.aClass3_57 == null) {
			return null;
		}
		@Pc(29) Class3 local29 = this.aClass3Array1[(int) (this.aLong51 & (long) (this.anInt1760 - 1))];
		while (local29 != this.aClass3_57) {
			if (this.aLong51 == this.aClass3_57.aLong81) {
				@Pc(40) Class3 local40 = this.aClass3_57;
				this.aClass3_57 = this.aClass3_57.aClass3_96;
				return local40;
			}
			this.aClass3_57 = this.aClass3_57.aClass3_96;
		}
		this.aClass3_57 = null;
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Lclient!de;")
	public Class3 method1087() {
		this.anInt1767 = 0;
		return this.method1080();
	}
}
