import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class33 {

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
	public int anInt770;

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
	public int anInt771;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
	public int anInt773;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	public int anInt776;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public int anInt777;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public int anInt780;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Lclient!bh;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public final int anInt774;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "B")
	public final byte aByte7;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public final int anInt768;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	private final int anInt772;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public final int anInt775;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIB)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt774 = arg3;
		this.aByte7 = arg4;
		this.anInt768 = arg1;
		this.anInt772 = arg0;
		this.anInt775 = arg2;
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!bh;I)V")
	public Class33(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		this.aClass33_1 = arg0;
		this.anInt774 = arg1 + this.aClass33_1.anInt774;
		this.aByte7 = this.aClass33_1.aByte7;
		this.anInt768 = arg1 + this.aClass33_1.anInt768;
		this.anInt772 = this.aClass33_1.anInt772;
		this.anInt775 = arg1 + this.aClass33_1.anInt775;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIII)Lclient!bh;")
	public Class33 method669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class33(this.anInt772, arg2, arg1, arg0, this.aByte7);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Lclient!sda;")
	public Class288 method670() {
		return Static299.method4520(this.anInt772);
	}
}
