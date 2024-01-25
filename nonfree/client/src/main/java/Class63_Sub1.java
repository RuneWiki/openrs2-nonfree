import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!cp", name = "J", descriptor = "[I")
	private int[] anIntArray130;

	@OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
	private int anInt1796;

	@OriginalMember(owner = "client!cp", name = "G", descriptor = "[[B")
	private final byte[][] aByteArrayArray15 = new byte[10][];

	@OriginalMember(owner = "client!cp", name = "L", descriptor = "Lclient!so;")
	private final Class14_Sub29 aClass14_Sub29_1 = new Class14_Sub29((byte[]) null);

	@OriginalMember(owner = "client!cp", name = "P", descriptor = "Lclient!so;")
	private final Class14_Sub29 aClass14_Sub29_2 = new Class14_Sub29((byte[]) null);

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "Lclient!wia;")
	private final Class386 aClass386_20;

	@OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
	private final int anInt1797;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILclient!wia;I)V")
	public Class63_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass386_20 = arg1;
		this.anInt1797 = arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([BZ)I")
	@Override
	protected int method1529(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray130 == null) {
			if (!this.aClass386_20.method9216(this.anInt1797, 0)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass386_20.method9196(0, this.anInt1797);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass14_Sub29_2.aByteArray84 = local26;
			this.aClass14_Sub29_2.anInt7264 = 0;
			local46 = local26.length >> 1;
			this.anIntArray130 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray130[local52] = this.aClass14_Sub29_2.method5900();
			}
		}
		if (this.anIntArray130.length <= this.anInt1796) {
			return -1;
		}
		this.method1535();
		this.aClass14_Sub29_2.aByteArray84 = arg0;
		this.aClass14_Sub29_2.anInt7264 = 0;
		do {
			if (this.aClass14_Sub29_2.aByteArray84.length <= this.aClass14_Sub29_2.anInt7264) {
				this.aClass14_Sub29_2.aByteArray84 = null;
				return arg0.length;
			}
			if (this.aClass14_Sub29_1.aByteArray84 == null) {
				if (this.aByteArrayArray15[0] == null) {
					this.aClass14_Sub29_2.aByteArray84 = null;
					return this.aClass14_Sub29_2.anInt7264;
				}
				this.aClass14_Sub29_1.aByteArray84 = this.aByteArrayArray15[0];
			}
			@Pc(130) int local130 = this.aClass14_Sub29_2.aByteArray84.length - this.aClass14_Sub29_2.anInt7264;
			local46 = this.aClass14_Sub29_1.aByteArray84.length - this.aClass14_Sub29_1.anInt7264;
			if (local46 > local130) {
				this.aClass14_Sub29_1.method5860(this.aClass14_Sub29_2.aByteArray84, this.aClass14_Sub29_2.anInt7264, local130);
				this.aClass14_Sub29_2.aByteArray84 = null;
				return arg0.length;
			}
			this.aClass14_Sub29_2.method5838(this.aClass14_Sub29_1.anInt7264, this.aClass14_Sub29_1.aByteArray84, local46);
			this.anInt1796++;
			this.aClass14_Sub29_1.anInt7264 = 0;
			this.aClass14_Sub29_1.aByteArray84 = null;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray15[local52] = this.aByteArrayArray15[local52 + 1];
			}
			this.aByteArrayArray15[9] = null;
		} while (this.anIntArray130.length > this.anInt1796);
		this.aClass14_Sub29_2.aByteArray84 = null;
		return this.aClass14_Sub29_2.anInt7264;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(B)V")
	public void method1535() {
		if (this.anIntArray130 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10 && this.anInt1796 + local11 < this.anIntArray130.length; local11++) {
			if (this.aByteArrayArray15[local11] == null && this.aClass386_20.method9216(this.anIntArray130[local11 + this.anInt1796], 0)) {
				this.aByteArrayArray15[local11] = this.aClass386_20.method9196(0, this.anIntArray130[local11 + this.anInt1796]);
			}
		}
	}
}
