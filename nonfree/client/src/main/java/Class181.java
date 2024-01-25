import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class181 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
	public int anInt4666;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!gv;")
	public Class141 aClass141_5;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public int anInt4663 = 0;

	@OriginalMember(owner = "client!jc", name = "n", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public int anInt4668 = 64;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
	public int anInt4665 = 8;

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Z")
	public boolean aBoolean309 = true;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public int anInt4678 = 1190717;

	@OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
	public int anInt4673 = 127;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public int anInt4677 = -1;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	public int anInt4676 = -1;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Z")
	public boolean aBoolean311 = true;

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
	public int anInt4679 = 512;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public void method4248() {
		this.anInt4665 = this.anInt4666 | this.anInt4665 << 8;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBLclient!wq;)V")
	private void method4251(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.anInt4663 = Static616.method8460(arg1.method7331());
		} else if (arg0 == 2) {
			this.anInt4676 = arg1.method7291();
		} else if (arg0 == 3) {
			this.anInt4676 = arg1.method7333();
			if (this.anInt4676 == 65535) {
				this.anInt4676 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean309 = false;
		} else if (arg0 == 7) {
			this.anInt4677 = Static616.method8460(arg1.method7331());
		} else if (arg0 == 8) {
			this.aClass141_5.anInt3620 = this.anInt4666;
		} else if (arg0 == 9) {
			this.anInt4679 = arg1.method7333() << 2;
		} else if (arg0 == 10) {
			this.aBoolean311 = false;
		} else if (arg0 == 11) {
			this.anInt4665 = arg1.method7291();
		} else if (arg0 == 12) {
			this.aBoolean310 = true;
		} else if (arg0 == 13) {
			this.anInt4678 = arg1.method7331();
		} else if (arg0 == 14) {
			this.anInt4668 = arg1.method7291() << 2;
		} else if (arg0 == 16) {
			this.anInt4673 = arg1.method7291();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!wq;)V")
	public void method4252(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method4251(local5, arg0);
		}
	}
}
