import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class50 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ld;")
	private Class2 aClass2_79;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!ld;")
	private Class2 aClass2_80;

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	private int anInt2322 = 0;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
	private final int anInt2319;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "[Lclient!ld;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.anInt2319 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_94 = local23;
			local23.aClass2_93 = local23;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Lclient!ld;")
	public Class2 method1455() {
		if (this.aClass2_79 == null) {
			return null;
		}
		@Pc(26) Class2 local26 = this.aClass2Array1[(int) (this.aLong62 & (long) (this.anInt2319 - 1))];
		while (local26 != this.aClass2_79) {
			if (this.aClass2_79.aLong72 == this.aLong62) {
				@Pc(41) Class2 local41 = this.aClass2_79;
				this.aClass2_79 = this.aClass2_79.aClass2_93;
				return local41;
			}
			this.aClass2_79 = this.aClass2_79.aClass2_93;
		}
		this.aClass2_79 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Lclient!ld;")
	private Class2 method1457() {
		@Pc(24) Class2 local24;
		if (this.anInt2322 > 0 && this.aClass2Array1[this.anInt2322 - 1] != this.aClass2_80) {
			local24 = this.aClass2_80;
			this.aClass2_80 = local24.aClass2_93;
			return local24;
		}
		while (this.anInt2319 > this.anInt2322) {
			local24 = this.aClass2Array1[this.anInt2322++].aClass2_93;
			if (local24 != this.aClass2Array1[this.anInt2322 - 1]) {
				this.aClass2_80 = local24.aClass2_93;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Lclient!ld;")
	public Class2 method1458() {
		this.anInt2322 = 0;
		return this.method1457();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)Lclient!ld;")
	public Class2 method1460(@OriginalArg(1) long arg0) {
		this.aLong62 = arg0;
		@Pc(18) Class2 local18 = this.aClass2Array1[(int) (arg0 & (long) (this.anInt2319 - 1))];
		for (this.aClass2_79 = local18.aClass2_93; this.aClass2_79 != local18; this.aClass2_79 = this.aClass2_79.aClass2_93) {
			if (this.aClass2_79.aLong72 == arg0) {
				@Pc(36) Class2 local36 = this.aClass2_79;
				this.aClass2_79 = this.aClass2_79.aClass2_93;
				return local36;
			}
		}
		this.aClass2_79 = null;
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!ld;JI)V")
	public void method1461(@OriginalArg(0) Class2 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass2_94 != null) {
			arg0.method1695();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt2319 - 1) & arg1)];
		arg0.aClass2_93 = local21;
		arg0.aClass2_94 = local21.aClass2_94;
		arg0.aClass2_94.aClass2_93 = arg0;
		arg0.aClass2_93.aClass2_94 = arg0;
		arg0.aLong72 = arg1;
	}
}
