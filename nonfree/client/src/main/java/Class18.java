import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class18 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public int anInt200;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public int anInt201;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "I")
	public int anInt204;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	public int anInt206;

	@OriginalMember(owner = "client!al", name = "q", descriptor = "I")
	public int anInt207;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Lclient!al;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!al", name = "t", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "I")
	public final int anInt196;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public final int anInt197;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public final int anInt203;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	private final int anInt205;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIB)V")
	public Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt196 = arg1;
		this.anInt197 = arg2;
		this.anInt203 = arg3;
		this.anInt205 = arg0;
		this.aByte1 = arg4;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lclient!hd;")
	public Class125 method261() {
		return Static528.method4109(this.anInt205);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)Lclient!al;")
	public Class18 method262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return new Class18(this.anInt205, arg2, arg0, arg1, this.aByte1);
	}
}
