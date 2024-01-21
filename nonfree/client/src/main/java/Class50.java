import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class50 {

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!dc;")
	private Class10 aClass10_75;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!dc;")
	private Class10 aClass10_76;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
	private int anInt2150 = 0;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "[Lclient!dc;")
	private final Class10[] aClass10Array1;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	private final int anInt2145;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
	public Class50(@OriginalArg(0) int arg0) {
		this.aClass10Array1 = new Class10[arg0];
		this.anInt2145 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class10 local23 = this.aClass10Array1[local13] = new Class10();
			local23.aClass10_94 = local23;
			local23.aClass10_93 = local23;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Lclient!dc;")
	public Class10 method1248() {
		if (this.aClass10_75 == null) {
			return null;
		}
		@Pc(26) Class10 local26 = this.aClass10Array1[(int) (this.aLong60 & (long) (this.anInt2145 - 1))];
		while (this.aClass10_75 != local26) {
			if (this.aClass10_75.aLong81 == this.aLong60) {
				@Pc(37) Class10 local37 = this.aClass10_75;
				this.aClass10_75 = this.aClass10_75.aClass10_94;
				return local37;
			}
			this.aClass10_75 = this.aClass10_75.aClass10_94;
		}
		this.aClass10_75 = null;
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)Lclient!dc;")
	private Class10 method1249() {
		@Pc(24) Class10 local24;
		if (this.anInt2150 > 0 && this.aClass10Array1[this.anInt2150 - 1] != this.aClass10_76) {
			local24 = this.aClass10_76;
			this.aClass10_76 = local24.aClass10_94;
			return local24;
		}
		while (this.anInt2145 > this.anInt2150) {
			local24 = this.aClass10Array1[this.anInt2150++].aClass10_94;
			if (local24 != this.aClass10Array1[this.anInt2150 - 1]) {
				this.aClass10_76 = local24.aClass10_94;
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Lclient!dc;")
	public Class10 method1250(@OriginalArg(0) long arg0) {
		this.aLong60 = arg0;
		@Pc(26) Class10 local26 = this.aClass10Array1[(int) ((long) (this.anInt2145 - 1) & arg0)];
		for (this.aClass10_75 = local26.aClass10_94; this.aClass10_75 != local26; this.aClass10_75 = this.aClass10_75.aClass10_94) {
			if (this.aClass10_75.aLong81 == arg0) {
				@Pc(40) Class10 local40 = this.aClass10_75;
				this.aClass10_75 = this.aClass10_75.aClass10_94;
				return local40;
			}
		}
		this.aClass10_75 = null;
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Lclient!dc;")
	public Class10 method1251() {
		this.anInt2150 = 0;
		return this.method1249();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!dc;J)V")
	public void method1252(@OriginalArg(1) Class10 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass10_93 != null) {
			arg0.method1654();
		}
		@Pc(17) Class10 local17 = this.aClass10Array1[(int) (arg1 & (long) (this.anInt2145 - 1))];
		arg0.aClass10_93 = local17.aClass10_93;
		arg0.aLong81 = arg1;
		arg0.aClass10_94 = local17;
		arg0.aClass10_93.aClass10_94 = arg0;
		arg0.aClass10_94.aClass10_93 = arg0;
	}
}
