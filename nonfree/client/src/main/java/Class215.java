import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class215 {

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Lclient!cfa;")
	public Class46 aClass46_3;

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public int anInt7039;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
	public int anInt7032 = 64;

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
	public int anInt7035 = 1190717;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "Z")
	public boolean aBoolean556 = false;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "Z")
	public boolean aBoolean557 = true;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
	public int anInt7036 = 127;

	@OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
	public int anInt7040 = 0;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
	public int anInt7038 = 8;

	@OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
	public int anInt7042 = -1;

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public int anInt7031 = 512;

	@OriginalMember(owner = "client!nba", name = "q", descriptor = "Z")
	public boolean aBoolean558 = true;

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
	public int anInt7046 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!ji;)V")
	public void method5878(@OriginalArg(1) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method5879(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILclient!ji;)V")
	private void method5879(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt7040 = Static570.method7989(arg1.method8203());
		} else if (arg0 == 2) {
			this.anInt7046 = arg1.method8246();
		} else if (arg0 == 3) {
			this.anInt7046 = arg1.method8220();
			if (this.anInt7046 == 65535) {
				this.anInt7046 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean557 = false;
		} else if (arg0 == 7) {
			this.anInt7042 = Static570.method7989(arg1.method8203());
		} else if (arg0 == 8) {
			this.aClass46_3.anInt2310 = this.anInt7039;
		} else if (arg0 == 9) {
			this.anInt7031 = arg1.method8220() << 2;
		} else if (arg0 == 10) {
			this.aBoolean558 = false;
		} else if (arg0 == 11) {
			this.anInt7038 = arg1.method8246();
		} else if (arg0 == 12) {
			this.aBoolean556 = true;
		} else if (arg0 == 13) {
			this.anInt7035 = arg1.method8203();
		} else if (arg0 == 14) {
			this.anInt7032 = arg1.method8246() << 2;
		} else if (arg0 == 16) {
			this.anInt7036 = arg1.method8246();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
	public void method5881() {
		this.anInt7038 = this.anInt7038 << 8 | this.anInt7039;
	}
}
