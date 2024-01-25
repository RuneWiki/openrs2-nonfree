import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class140_Sub1 extends Class140 {

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[B")
	public static final byte[] aByteArray80 = new byte[32896];

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "I")
	private int anInt8513;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "[I")
	private int[] anIntArray478;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "[[B")
	private final byte[][] aByteArrayArray29 = new byte[10][];

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "Lclient!mc;")
	private final Class5_Sub41 aClass5_Sub41_8 = new Class5_Sub41((byte[]) null);

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "Lclient!mc;")
	private final Class5_Sub41 aClass5_Sub41_9 = new Class5_Sub41((byte[]) null);

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
	private final int anInt8514;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "Lclient!wm;")
	private final Class390 aClass390_98;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray80[local4++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(ILclient!wm;I)V")
	public Class140_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt8514 = arg2;
		this.aClass390_98 = arg1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(Z)V")
	public void method7263() {
		if (this.anIntArray478 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anIntArray478.length <= local15 + this.anInt8513) {
				return;
			}
			if (this.aByteArrayArray29[local15] == null && this.aClass390_98.method8902(this.anIntArray478[local15 + this.anInt8513], 0)) {
				this.aByteArrayArray29[local15] = this.aClass390_98.method8914(this.anIntArray478[this.anInt8513 + local15], 0);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BB)I")
	@Override
	protected int method7257(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray478 == null) {
			if (!this.aClass390_98.method8902(this.anInt8514, 0)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass390_98.method8914(this.anInt8514, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub41_9.anInt9230 = 0;
			this.aClass5_Sub41_9.aByteArray93 = local26;
			local46 = local26.length >> 1;
			this.anIntArray478 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray478[local52] = this.aClass5_Sub41_9.method7860();
			}
		}
		if (this.anInt8513 >= this.anIntArray478.length) {
			return -1;
		}
		this.method7263();
		this.aClass5_Sub41_9.anInt9230 = 0;
		this.aClass5_Sub41_9.aByteArray93 = arg0;
		do {
			if (this.aClass5_Sub41_9.aByteArray93.length <= this.aClass5_Sub41_9.anInt9230) {
				this.aClass5_Sub41_9.aByteArray93 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub41_8.aByteArray93 == null) {
				if (this.aByteArrayArray29[0] == null) {
					this.aClass5_Sub41_9.aByteArray93 = null;
					return this.aClass5_Sub41_9.anInt9230;
				}
				this.aClass5_Sub41_8.aByteArray93 = this.aByteArrayArray29[0];
			}
			@Pc(130) int local130 = this.aClass5_Sub41_9.aByteArray93.length - this.aClass5_Sub41_9.anInt9230;
			local46 = this.aClass5_Sub41_8.aByteArray93.length - this.aClass5_Sub41_8.anInt9230;
			if (local46 > local130) {
				this.aClass5_Sub41_8.method7802(local130, this.aClass5_Sub41_9.anInt9230, this.aClass5_Sub41_9.aByteArray93);
				this.aClass5_Sub41_9.aByteArray93 = null;
				return arg0.length;
			}
			this.aClass5_Sub41_9.method7837(this.aClass5_Sub41_8.anInt9230, local46, this.aClass5_Sub41_8.aByteArray93);
			this.aClass5_Sub41_8.aByteArray93 = null;
			this.aClass5_Sub41_8.anInt9230 = 0;
			this.anInt8513++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray29[local52] = this.aByteArrayArray29[local52 + 1];
			}
			this.aByteArrayArray29[9] = null;
		} while (this.anIntArray478.length > this.anInt8513);
		this.aClass5_Sub41_9.aByteArray93 = null;
		return this.aClass5_Sub41_9.anInt9230;
	}
}
