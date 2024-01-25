import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class249 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
	public int anInt6863;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "Lclient!nba;")
	public Class245 aClass245_4;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
	public int anInt6862 = 1190717;

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
	public int anInt6868 = 8;

	@OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
	public int anInt6870 = 512;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
	public int anInt6864 = -1;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
	public int anInt6871 = -1;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
	public int anInt6865 = 64;

	@OriginalMember(owner = "client!nga", name = "m", descriptor = "I")
	public int anInt6873 = 127;

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
	public int anInt6869 = 0;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
	public boolean aBoolean513 = true;

	@OriginalMember(owner = "client!nga", name = "n", descriptor = "Z")
	public boolean aBoolean512 = true;

	@OriginalMember(owner = "client!nga", name = "i", descriptor = "Z")
	public boolean aBoolean514 = false;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method6098(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method3030();
			if (local9 == 0) {
				return;
			}
			this.method6099(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILclient!jc;I)V")
	private void method6099(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6869 = Static224.method4041(arg0.method2987());
		} else if (arg1 == 2) {
			this.anInt6871 = arg0.method3030();
		} else if (arg1 == 3) {
			this.anInt6871 = arg0.method3018();
			if (this.anInt6871 == 65535) {
				this.anInt6871 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean513 = false;
		} else if (arg1 == 7) {
			this.anInt6864 = Static224.method4041(arg0.method2987());
		} else if (arg1 == 8) {
			this.aClass245_4.anInt6719 = this.anInt6863;
		} else if (arg1 == 9) {
			this.anInt6870 = arg0.method3018() << 2;
		} else if (arg1 == 10) {
			this.aBoolean512 = false;
		} else if (arg1 == 11) {
			this.anInt6868 = arg0.method3030();
		} else if (arg1 == 12) {
			this.aBoolean514 = true;
		} else if (arg1 == 13) {
			this.anInt6862 = arg0.method2987();
		} else if (arg1 == 14) {
			this.anInt6865 = arg0.method3030() << 2;
		} else if (arg1 == 16) {
			this.anInt6873 = arg0.method3030();
		}
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)V")
	public void method6100() {
		this.anInt6868 = this.anInt6868 << 8 | this.anInt6863;
	}
}
