import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class142 implements Interface16 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public final int anInt4163;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	public final int anInt4170;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	public final int anInt4171;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!pd;")
	public final Class247 aClass247_5;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public final int anInt4168;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public final int anInt4164;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public final int anInt4167;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public final int anInt4165;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Z")
	public final boolean aBoolean286;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public final int anInt4166;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!tl;")
	public final Class319 aClass319_5;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(ILclient!tl;Lclient!pd;IIIIIIIZ)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) Class319 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4163 = arg3;
		this.anInt4170 = arg6;
		this.anInt4171 = arg4;
		this.aClass247_5 = arg2;
		this.anInt4168 = arg9;
		this.anInt4164 = arg7;
		this.anInt4167 = arg0;
		this.anInt4165 = arg8;
		this.aBoolean286 = arg10;
		this.anInt4166 = arg5;
		this.aClass319_5 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static71.aClass153_4;
	}
}
