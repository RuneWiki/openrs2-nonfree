import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class196 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!ku;")
	public Class146 aClass146_4;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int anInt4970;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	public boolean aBoolean350 = false;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public int anInt4967 = 1190717;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Z")
	public boolean aBoolean351 = true;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public int anInt4965 = 128;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public int anInt4971 = -1;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public int anInt4973 = 8;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	public int anInt4966 = 16;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Z")
	public boolean aBoolean352 = true;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public int anInt4978 = -1;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public int anInt4968 = 0;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int anInt4979 = 127;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	public int anInt4976 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZLclient!ha;)V")
	private void method4395(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt4968 = Static365.method3022(arg1.method3078());
		} else if (arg0 == 2) {
			this.anInt4971 = arg1.method3111();
		} else if (arg0 == 3) {
			this.anInt4971 = arg1.method3108();
			if (this.anInt4971 == 65535) {
				this.anInt4971 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean352 = false;
		} else if (arg0 == 7) {
			this.anInt4978 = Static365.method3022(arg1.method3078());
		} else if (arg0 == 8) {
			this.aClass146_4.anInt3747 = this.anInt4970;
		} else if (arg0 == 9) {
			this.anInt4965 = arg1.method3108() << 0;
		} else if (arg0 == 10) {
			this.aBoolean351 = false;
		} else if (arg0 == 11) {
			this.anInt4973 = arg1.method3111();
		} else if (arg0 == 12) {
			this.aBoolean350 = true;
		} else if (arg0 == 13) {
			this.anInt4967 = arg1.method3078();
		} else if (arg0 == 14) {
			this.anInt4966 = arg1.method3111();
		} else if (arg0 == 15) {
			this.anInt4976 = arg1.method3108();
			if (this.anInt4976 == 65535) {
				this.anInt4976 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt4979 = arg1.method3111();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ha;)V")
	public void method4396(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method4395(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	public void method4397() {
		this.anInt4973 = this.anInt4970 | this.anInt4973 << 8;
		if (this.anInt4976 == -1) {
			this.anInt4976 = this.anInt4971;
		}
	}
}
