import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class20_Sub7 extends Class20 {

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
	public boolean aBoolean216 = false;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	private int anInt4437 = 0;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	private int anInt4438 = 0;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	private int anInt4444 = -32768;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	private int anInt4436;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	public int anInt4441;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
	public int anInt4447;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public int anInt4443;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public int anInt4434;

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "Lclient!tc;")
	private Class110 aClass110_3;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class20_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4436 = arg0;
		this.anInt4441 = arg3;
		this.anInt4447 = arg6 + arg5;
		this.anInt4435 = arg2;
		this.anInt4443 = arg1;
		this.anInt4434 = arg4;
		@Pc(40) int local40 = Static216.method3377(this.anInt4436).anInt1563;
		if (local40 == -1) {
			this.aBoolean216 = true;
		} else {
			this.aBoolean216 = false;
			this.aClass110_3 = Static200.method3204(local40);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return this.anInt4444;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
	public void method3500(@OriginalArg(0) int arg0) {
		if (this.aBoolean216) {
			return;
		}
		this.anInt4437 += arg0;
		while (this.aClass110_3.anIntArray460[this.anInt4438] < this.anInt4437) {
			this.anInt4437 -= this.aClass110_3.anIntArray460[this.anInt4438];
			this.anInt4438++;
			if (this.anInt4438 >= this.aClass110_3.anIntArray458.length) {
				this.aBoolean216 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class20_Sub5 local7 = this.method3501();
		if (local7 != null) {
			local7.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt4444 = local7.method3494();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)Lclient!ra;")
	private Class20_Sub5 method3501() {
		@Pc(13) Class46 local13 = Static216.method3377(this.anInt4436);
		@Pc(22) Class20_Sub5 local22;
		if (this.aBoolean216) {
			local22 = local13.method1128(-1);
		} else {
			local22 = local13.method1128(this.anInt4438);
		}
		return local22 == null ? null : local22;
	}
}
