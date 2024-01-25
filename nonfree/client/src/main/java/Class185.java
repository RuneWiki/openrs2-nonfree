import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class185 {

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "J")
	private long aLong152;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "Lclient!jda;")
	private Class2_Sub5 aClass2_Sub5_42;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
	private final int anInt5354;

	@OriginalMember(owner = "client!kaa", name = "i", descriptor = "[Lclient!jda;")
	private final Class2_Sub5[] aClass2_Sub5Array1;

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(I)V")
	public Class185(@OriginalArg(0) int arg0) {
		this.anInt5354 = arg0;
		this.aClass2_Sub5Array1 = new Class2_Sub5[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub5 local20 = this.aClass2_Sub5Array1[local10] = new Class2_Sub5();
			local20.aClass2_Sub5_67 = local20;
			local20.aClass2_Sub5_66 = local20;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)Lclient!jda;")
	public Class2_Sub5 method4459() {
		if (this.aClass2_Sub5_42 == null) {
			return null;
		}
		@Pc(21) Class2_Sub5 local21 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt5354 - 1) & this.aLong152)];
		while (this.aClass2_Sub5_42 != local21) {
			if (this.aClass2_Sub5_42.aLong283 == this.aLong152) {
				@Pc(36) Class2_Sub5 local36 = this.aClass2_Sub5_42;
				this.aClass2_Sub5_42 = this.aClass2_Sub5_42.aClass2_Sub5_66;
				return local36;
			}
			this.aClass2_Sub5_42 = this.aClass2_Sub5_42.aClass2_Sub5_66;
		}
		this.aClass2_Sub5_42 = null;
		return null;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(JLclient!jda;I)V")
	public void method4464(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		if (arg1.aClass2_Sub5_67 != null) {
			arg1.method8464();
		}
		@Pc(21) Class2_Sub5 local21 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt5354 - 1) & arg0)];
		arg1.aClass2_Sub5_67 = local21.aClass2_Sub5_67;
		arg1.aClass2_Sub5_66 = local21;
		arg1.aClass2_Sub5_67.aClass2_Sub5_66 = arg1;
		arg1.aLong283 = arg0;
		arg1.aClass2_Sub5_66.aClass2_Sub5_67 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(JZ)Lclient!jda;")
	public Class2_Sub5 method4465(@OriginalArg(0) long arg0) {
		this.aLong152 = arg0;
		@Pc(18) Class2_Sub5 local18 = this.aClass2_Sub5Array1[(int) ((long) (this.anInt5354 - 1) & arg0)];
		for (this.aClass2_Sub5_42 = local18.aClass2_Sub5_66; this.aClass2_Sub5_42 != local18; this.aClass2_Sub5_42 = this.aClass2_Sub5_42.aClass2_Sub5_66) {
			if (this.aClass2_Sub5_42.aLong283 == arg0) {
				@Pc(44) Class2_Sub5 local44 = this.aClass2_Sub5_42;
				this.aClass2_Sub5_42 = this.aClass2_Sub5_42.aClass2_Sub5_66;
				return local44;
			}
		}
		this.aClass2_Sub5_42 = null;
		return null;
	}
}
