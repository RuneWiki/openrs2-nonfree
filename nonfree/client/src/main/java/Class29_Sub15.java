import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class29_Sub15 extends Class29 {

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	private final int anInt7983;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
	private final int anInt7985;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	private final int anInt7984;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	private final int anInt7973;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	private final int anInt7971;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	private final int anInt7981;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
	private final int anInt7972;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
	private final int anInt7977;

	@OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
	private final int anInt7982;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	private final int anInt7980;

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
	private final int anInt7974;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	private final int anInt7976;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
	private final int anInt7978;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!ika;II)V")
	public Class29_Sub15(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(10) int local10;
		if (arg1 == 0) {
			local10 = arg0.method2036();
			this.anInt7983 = local10 >>> 16;
			this.anInt7985 = -1;
			this.anInt7984 = local10 & 0xFFFF;
		} else {
			this.anInt7983 = -1;
			this.anInt7984 = -1;
			this.anInt7985 = arg0.method2028(-14795);
		}
		if (arg2 == 0) {
			local10 = arg0.method2036();
			this.anInt7973 = local10 & 0xFFFF;
			this.anInt7981 = -1;
			this.anInt7971 = local10 >>> 16;
		} else {
			this.anInt7973 = -1;
			this.anInt7971 = -1;
			this.anInt7981 = arg0.method2028(-14795);
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt7972 = arg0.method2048(255);
		} else {
			this.anInt7972 = -1;
		}
		this.anInt7977 = arg0.method2028(-14795);
		this.anInt7982 = arg0.method2048(255);
		this.anInt7980 = arg0.method2048(255);
		this.anInt7974 = arg0.method2061();
		this.anInt7976 = arg0.method2028(-14795);
		this.anInt7978 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(26) int local26;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(20) Class9_Sub1_Sub1_Sub2 local20;
		if (this.anInt7983 < 0) {
			local20 = Static470.aClass7Array1[this.anInt7985].method249();
			local23 = local20.anInt10695;
			local26 = local20.anInt10694;
			local29 = local20.aByte139;
		} else {
			local23 = this.anInt7984 * 512 + 256;
			local26 = this.anInt7983 * 512 + 256;
			local29 = this.anInt7972;
		}
		@Pc(68) int local68;
		@Pc(61) int local61;
		if (this.anInt7984 >= 0) {
			local61 = this.anInt7973 * 512 + 256;
			local68 = this.anInt7971 * 512 + 256;
		} else {
			local20 = Static470.aClass7Array1[this.anInt7981].method249();
			if (local29 < 0) {
				local29 = local20.aByte139;
			}
			local61 = local20.anInt10695;
			local68 = local20.anInt10694;
		}
		@Pc(93) int local93 = this.anInt7978 << 2;
		@Pc(129) Class9_Sub1_Sub1_Sub4 local129 = new Class9_Sub1_Sub1_Sub4(this.anInt7977, local29, local29, local26, local23, this.anInt7982 << 2, Static716.anInt11157, Static716.anInt11157 + this.anInt7974, this.anInt7976, local93, this.anInt7985 + 1, this.anInt7981 + 1, this.anInt7980 << 2, false, 0);
		local129.method4629(this.anInt7980 << 2, local68, Static716.anInt11157 + this.anInt7974, local61);
		Static355.aClass342_94.method7654(new Class3_Sub7_Sub14(local129));
	}
}
