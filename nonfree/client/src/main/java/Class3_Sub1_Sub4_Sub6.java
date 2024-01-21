import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub1_Sub4_Sub6 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!le", name = "vb", descriptor = "I")
	private int anInt1764 = 0;

	@OriginalMember(owner = "client!le", name = "yb", descriptor = "I")
	private int anInt1766 = 0;

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "Z")
	public boolean aBoolean63 = false;

	@OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
	public final int anInt1761;

	@OriginalMember(owner = "client!le", name = "zb", descriptor = "I")
	public final int anInt1767;

	@OriginalMember(owner = "client!le", name = "pb", descriptor = "I")
	private final int anInt1763;

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "I")
	public final int anInt1759;

	@OriginalMember(owner = "client!le", name = "Ab", descriptor = "I")
	public final int anInt1768;

	@OriginalMember(owner = "client!le", name = "Cb", descriptor = "I")
	public final int anInt1770;

	@OriginalMember(owner = "client!le", name = "hb", descriptor = "Lclient!qc;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_3;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1761 = arg3;
		this.anInt1767 = arg2;
		this.anInt1763 = arg0;
		this.anInt1759 = arg4;
		this.anInt1768 = arg6 + arg5;
		this.anInt1770 = arg1;
		@Pc(37) int local37 = Static89.method1461(this.anInt1763).anInt359;
		if (local37 == -1) {
			this.aBoolean63 = true;
		} else {
			this.aBoolean63 = false;
			this.aClass3_Sub1_Sub11_3 = Static97.method1629(local37);
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(II)V")
	public void method1197(@OriginalArg(0) int arg0) {
		if (this.aBoolean63) {
			return;
		}
		this.anInt1764 += arg0;
		while (this.anInt1764 > this.aClass3_Sub1_Sub11_3.anIntArray305[this.anInt1766]) {
			this.anInt1764 -= this.aClass3_Sub1_Sub11_3.anIntArray305[this.anInt1766];
			this.anInt1766++;
			if (this.anInt1766 >= this.aClass3_Sub1_Sub11_3.anIntArray306.length) {
				this.aBoolean63 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		@Pc(8) Class3_Sub1_Sub3 local8 = Static89.method1461(this.anInt1763);
		@Pc(18) Class3_Sub1_Sub4_Sub7 local18;
		if (this.aBoolean63) {
			local18 = local8.method239(-1);
		} else {
			local18 = local8.method239(this.anInt1766);
		}
		return local18 == null ? null : local18;
	}
}
