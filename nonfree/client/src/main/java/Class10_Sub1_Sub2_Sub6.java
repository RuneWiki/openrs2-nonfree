import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WHUAOHZM")
public final class Class10_Sub1_Sub2_Sub6 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!WHUAOHZM", name = "s", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!WHUAOHZM", name = "t", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!WHUAOHZM", name = "q", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!WHUAOHZM", name = "r", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!WHUAOHZM", name = "u", descriptor = "Lclient!MNZYLKNY;")
	private Class28 aClass28_2;

	@OriginalMember(owner = "client!WHUAOHZM", name = "m", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!WHUAOHZM", name = "n", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!WHUAOHZM", name = "o", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!WHUAOHZM", name = "p", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!WHUAOHZM", name = "v", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!WHUAOHZM", name = "<init>", descriptor = "(IIIIIIII)V")
	public Class10_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.aClass28_2 = Class28.aClass28Array1[arg4];
			this.anInt623 = arg1;
			this.anInt624 = arg0;
			this.anInt625 = arg6;
			this.anInt626 = arg2;
			this.anInt629 = arg5 + arg3;
			this.aBoolean156 = false;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("83840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(BI)V")
	public void method420(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt628 += arg1;
			@Pc(10) boolean local10 = false;
			while (true) {
				do {
					do {
						if (this.anInt628 <= this.aClass28_2.aClass15_1.method97(this.anInt627)) {
							return;
						}
						this.anInt628 -= this.aClass28_2.aClass15_1.method97(this.anInt627);
						this.anInt627++;
					} while (this.anInt627 < this.aClass28_2.aClass15_1.anInt152);
				} while (this.anInt627 >= 0 && this.anInt627 < this.aClass28_2.aClass15_1.anInt152);
				this.anInt627 = 0;
				this.aBoolean156 = true;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("8182, " + arg0 + ", " + arg1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WHUAOHZM", name = "a", descriptor = "(B)Lclient!LZYQDKJV;")
	@Override
	protected Class10_Sub1_Sub2_Sub4 method537(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 3) {
				throw new NullPointerException();
			}
			@Pc(10) Class10_Sub1_Sub2_Sub4 local10 = this.aClass28_2.method352();
			if (local10 == null) {
				return null;
			}
			@Pc(22) int local22 = this.aClass28_2.aClass15_1.anIntArray47[this.anInt627];
			@Pc(34) Class10_Sub1_Sub2_Sub4 local34 = new Class10_Sub1_Sub2_Sub4(false, false, true, local10, Class22.method169(this.aBoolean155, local22));
			if (!this.aBoolean156) {
				local34.method278();
				local34.method279(local22, (byte) 6);
				local34.anIntArrayArray11 = null;
				local34.anIntArrayArray10 = null;
			}
			if (this.aClass28_2.anInt438 != 128 || this.aClass28_2.anInt439 != 128) {
				local34.method287(this.aClass28_2.anInt439, this.aClass28_2.anInt438, this.aClass28_2.anInt438);
			}
			if (this.aClass28_2.anInt440 != 0) {
				if (this.aClass28_2.anInt440 == 90) {
					local34.method282();
				}
				if (this.aClass28_2.anInt440 == 180) {
					local34.method282();
					local34.method282();
				}
				if (this.aClass28_2.anInt440 == 270) {
					local34.method282();
					local34.method282();
					local34.method282();
				}
			}
			local34.method288(this.aClass28_2.anInt441 + 64, this.aClass28_2.anInt442 + 850, -30, -50, -30, true);
			return local34;
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("80333, " + arg0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}
}
