import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class8_Sub1_Sub1_Sub5 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
	private int anInt2098 = 0;

	@OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
	private int anInt2100 = 0;

	@OriginalMember(owner = "client!na", name = "vb", descriptor = "Z")
	public boolean aBoolean80 = false;

	@OriginalMember(owner = "client!na", name = "wb", descriptor = "I")
	public final int anInt2108;

	@OriginalMember(owner = "client!na", name = "Fb", descriptor = "I")
	public final int anInt2114;

	@OriginalMember(owner = "client!na", name = "Hb", descriptor = "I")
	public final int anInt2115;

	@OriginalMember(owner = "client!na", name = "sb", descriptor = "I")
	public final int anInt2105;

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
	private final int anInt2097;

	@OriginalMember(owner = "client!na", name = "ob", descriptor = "I")
	public final int anInt2102;

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "Lclient!dc;")
	private Class8_Sub1_Sub6 aClass8_Sub1_Sub6_2;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIII)V")
	public Class8_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2108 = arg5 + arg6;
		this.anInt2114 = arg2;
		this.anInt2115 = arg3;
		this.anInt2105 = arg4;
		this.anInt2097 = arg0;
		this.anInt2102 = arg1;
		@Pc(36) int local36 = Static14.method235(this.anInt2097).anInt638;
		if (local36 == -1) {
			this.aBoolean80 = true;
		} else {
			this.aBoolean80 = false;
			this.aClass8_Sub1_Sub6_2 = Static47.method733(local36);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)V")
	public void method1245(@OriginalArg(0) int arg0) {
		if (this.aBoolean80) {
			return;
		}
		this.anInt2098 += arg0;
		while (this.anInt2098 > this.aClass8_Sub1_Sub6_2.anIntArray76[this.anInt2100]) {
			this.anInt2098 -= this.aClass8_Sub1_Sub6_2.anIntArray76[this.anInt2100];
			this.anInt2100++;
			if (this.aClass8_Sub1_Sub6_2.anIntArray79.length <= this.anInt2100) {
				this.aBoolean80 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		@Pc(13) Class8_Sub1_Sub5 local13 = Static14.method235(this.anInt2097);
		@Pc(22) Class8_Sub1_Sub1_Sub6 local22;
		if (this.aBoolean80) {
			local22 = local13.method381(-1);
		} else {
			local22 = local13.method381(this.anInt2100);
		}
		return local22 == null ? null : local22;
	}
}
