import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class197 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!dg;")
	private Class5_Sub4 aClass5_Sub4_46;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[Lclient!dg;")
	private final Class5_Sub4[] aClass5_Sub4Array1;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	private final int anInt4812;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(I)V")
	public Class197(@OriginalArg(0) int arg0) {
		this.aClass5_Sub4Array1 = new Class5_Sub4[arg0];
		this.anInt4812 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub4 local20 = this.aClass5_Sub4Array1[local10] = new Class5_Sub4();
			local20.aClass5_Sub4_67 = local20;
			local20.aClass5_Sub4_66 = local20;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lclient!dg;")
	public Class5_Sub4 method4401() {
		if (this.aClass5_Sub4_46 == null) {
			return null;
		}
		@Pc(23) Class5_Sub4 local23 = this.aClass5_Sub4Array1[(int) ((long) (this.anInt4812 - 1) & this.aLong153)];
		while (this.aClass5_Sub4_46 != local23) {
			if (this.aClass5_Sub4_46.aLong273 == this.aLong153) {
				@Pc(39) Class5_Sub4 local39 = this.aClass5_Sub4_46;
				this.aClass5_Sub4_46 = this.aClass5_Sub4_46.aClass5_Sub4_67;
				return local39;
			}
			this.aClass5_Sub4_46 = this.aClass5_Sub4_46.aClass5_Sub4_67;
		}
		this.aClass5_Sub4_46 = null;
		return null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!dg;JZ)V")
	public void method4402(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass5_Sub4_66 != null) {
			arg0.method8741();
		}
		@Pc(21) Class5_Sub4 local21 = this.aClass5_Sub4Array1[(int) ((long) (this.anInt4812 - 1) & arg1)];
		arg0.aClass5_Sub4_66 = local21.aClass5_Sub4_66;
		arg0.aClass5_Sub4_67 = local21;
		arg0.aClass5_Sub4_66.aClass5_Sub4_67 = arg0;
		arg0.aLong273 = arg1;
		arg0.aClass5_Sub4_67.aClass5_Sub4_66 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(JI)Lclient!dg;")
	public Class5_Sub4 method4404(@OriginalArg(0) long arg0) {
		this.aLong153 = arg0;
		@Pc(25) Class5_Sub4 local25 = this.aClass5_Sub4Array1[(int) (arg0 & (long) (this.anInt4812 - 1))];
		for (this.aClass5_Sub4_46 = local25.aClass5_Sub4_67; this.aClass5_Sub4_46 != local25; this.aClass5_Sub4_46 = this.aClass5_Sub4_46.aClass5_Sub4_67) {
			if (this.aClass5_Sub4_46.aLong273 == arg0) {
				@Pc(40) Class5_Sub4 local40 = this.aClass5_Sub4_46;
				this.aClass5_Sub4_46 = this.aClass5_Sub4_46.aClass5_Sub4_67;
				return local40;
			}
		}
		this.aClass5_Sub4_46 = null;
		return null;
	}
}
