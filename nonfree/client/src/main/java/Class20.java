import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class20 {

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!ob;")
	private Class5 aClass5_41;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "Lclient!ob;")
	private Class5 aClass5_42;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	private int anInt965 = 0;

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "[Lclient!ob;")
	private final Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	private final int anInt962;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(I)V")
	public Class20(@OriginalArg(0) int arg0) {
		this.aClass5Array1 = new Class5[arg0];
		this.anInt962 = arg0;
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class5 local23 = this.aClass5Array1[local13] = new Class5();
			local23.aClass5_128 = local23;
			local23.aClass5_127 = local23;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ob;JB)V")
	public void method647(@OriginalArg(0) Class5 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass5_128 != null) {
			arg0.method2189();
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) ((long) (this.anInt962 - 1) & arg1)];
		arg0.aClass5_128 = local21.aClass5_128;
		arg0.aClass5_127 = local21;
		arg0.aLong100 = arg1;
		arg0.aClass5_128.aClass5_127 = arg0;
		arg0.aClass5_127.aClass5_128 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lclient!ob;")
	public Class5 method649() {
		@Pc(19) Class5 local19;
		if (this.anInt965 > 0 && this.aClass5_42 != this.aClass5Array1[this.anInt965 - 1]) {
			local19 = this.aClass5_42;
			this.aClass5_42 = local19.aClass5_127;
			return local19;
		}
		while (this.anInt965 < this.anInt962) {
			local19 = this.aClass5Array1[this.anInt965++].aClass5_127;
			if (local19 != this.aClass5Array1[this.anInt965 - 1]) {
				this.aClass5_42 = local19.aClass5_127;
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)Lclient!ob;")
	public Class5 method653() {
		if (this.aClass5_41 == null) {
			return null;
		}
		@Pc(21) Class5 local21 = this.aClass5Array1[(int) (this.aLong38 & (long) (this.anInt962 - 1))];
		while (local21 != this.aClass5_41) {
			if (this.aLong38 == this.aClass5_41.aLong100) {
				@Pc(44) Class5 local44 = this.aClass5_41;
				this.aClass5_41 = this.aClass5_41.aClass5_127;
				return local44;
			}
			this.aClass5_41 = this.aClass5_41.aClass5_127;
		}
		this.aClass5_41 = null;
		return null;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)Lclient!ob;")
	public Class5 method655() {
		this.anInt965 = 0;
		return this.method649();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)Lclient!ob;")
	public Class5 method656(@OriginalArg(0) long arg0) {
		this.aLong38 = arg0;
		@Pc(14) Class5 local14 = this.aClass5Array1[(int) (arg0 & (long) (this.anInt962 - 1))];
		for (this.aClass5_41 = local14.aClass5_127; this.aClass5_41 != local14; this.aClass5_41 = this.aClass5_41.aClass5_127) {
			if (arg0 == this.aClass5_41.aLong100) {
				@Pc(32) Class5 local32 = this.aClass5_41;
				this.aClass5_41 = this.aClass5_41.aClass5_127;
				return local32;
			}
		}
		this.aClass5_41 = null;
		return null;
	}
}
