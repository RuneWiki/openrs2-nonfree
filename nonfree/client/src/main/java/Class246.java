import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class246 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public int anInt6860;

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "Lclient!fh;")
	public Class98 aClass98_4;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public int anInt6859 = 127;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "Z")
	public boolean aBoolean510 = true;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Z")
	public boolean aBoolean509 = false;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public int anInt6862 = 1190717;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
	public int anInt6863 = -1;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
	public int anInt6869 = 0;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	public int anInt6868 = 64;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
	public int anInt6865 = -1;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Z")
	public boolean aBoolean511 = true;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	public int anInt6870 = 512;

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
	public int anInt6873 = 8;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)V")
	public void method5750() {
		this.anInt6873 = this.anInt6873 << 8 | this.anInt6860;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!np;I)V")
	private void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt6869 = Static307.method4487(arg1.method5230());
		} else if (arg0 == 2) {
			this.anInt6863 = arg1.method5175();
		} else if (arg0 == 3) {
			this.anInt6863 = arg1.method5198();
			if (this.anInt6863 == 65535) {
				this.anInt6863 = -1;
				return;
			}
			return;
		} else if (arg0 == 5) {
			this.aBoolean510 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt6865 = Static307.method4487(arg1.method5230());
			return;
		} else if (arg0 == 8) {
			this.aClass98_4.anInt3130 = this.anInt6860;
			return;
		} else if (arg0 == 9) {
			this.anInt6870 = arg1.method5198() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean511 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt6873 = arg1.method5175();
			return;
		} else if (arg0 == 12) {
			this.aBoolean509 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt6862 = arg1.method5230();
			return;
		} else if (arg0 == 14) {
			this.anInt6868 = arg1.method5175() << 2;
			return;
		} else if (arg0 == 16) {
			this.anInt6859 = arg1.method5175();
			return;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!np;)V")
	public void method5753(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method5751(local9, arg0);
		}
	}
}
