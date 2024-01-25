import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class307 {

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!iv;")
	public Class143 aClass143_6;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	public int anInt9147;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	public int anInt9137 = 127;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Z")
	public boolean aBoolean683 = false;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	public int anInt9138 = 0;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
	public int anInt9144 = 8;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	public int anInt9140 = 128;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	public int anInt9139 = 16;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	public int anInt9141 = -1;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public int anInt9143 = -1;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Z")
	public boolean aBoolean684 = true;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
	public int anInt9145 = -1;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Z")
	public boolean aBoolean685 = true;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	public int anInt9146 = 1190717;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!os;)V")
	public void method7897(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4487();
			if (local9 == 0) {
				return;
			}
			this.method7902(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method7899() {
		this.anInt9144 = this.anInt9147 | this.anInt9144 << 8;
		if (this.anInt9143 == -1) {
			this.anInt9143 = this.anInt9141;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!os;II)V")
	private void method7902(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt9138 = Static537.method8137(arg0.method4486());
		} else if (arg1 == 2) {
			this.anInt9141 = arg0.method4487();
		} else if (arg1 == 3) {
			this.anInt9141 = arg0.method4494();
			if (this.anInt9141 == 65535) {
				this.anInt9141 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean684 = false;
		} else if (arg1 == 7) {
			this.anInt9145 = Static537.method8137(arg0.method4486());
		} else if (arg1 == 8) {
			this.aClass143_6.anInt4239 = this.anInt9147;
		} else if (arg1 == 9) {
			this.anInt9140 = arg0.method4494() << 0;
		} else if (arg1 == 10) {
			this.aBoolean685 = false;
		} else if (arg1 == 11) {
			this.anInt9144 = arg0.method4487();
		} else if (arg1 == 12) {
			this.aBoolean683 = true;
		} else if (arg1 == 13) {
			this.anInt9146 = arg0.method4486();
		} else if (arg1 == 14) {
			this.anInt9139 = arg0.method4487() << 0;
		} else if (arg1 == 15) {
			this.anInt9143 = arg0.method4494();
			if (this.anInt9143 == 65535) {
				this.anInt9143 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt9137 = arg0.method4487();
		}
	}
}
