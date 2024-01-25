import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "[I")
	private int[] anIntArray335;

	@OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
	private int anInt6117;

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "[[B")
	private final byte[][] aByteArrayArray15 = new byte[10][];

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!ofa;")
	private final Class5_Sub22 aClass5_Sub22_11 = new Class5_Sub22(null);

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "Lclient!ofa;")
	private final Class5_Sub22 aClass5_Sub22_12 = new Class5_Sub22(null);

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
	private final int anInt6116;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Lclient!la;")
	private final Class207 aClass207_72;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILclient!la;I)V")
	public Class73_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt6116 = arg2;
		this.aClass207_72 = arg1;
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V")
	public void method5427() {
		if (this.anIntArray335 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10 && this.anIntArray335.length > this.anInt6117 + local11; local11++) {
			if (this.aByteArrayArray15[local11] == null && this.aClass207_72.method4697(this.anIntArray335[this.anInt6117 + local11], 0)) {
				this.aByteArrayArray15[local11] = this.aClass207_72.method4681(this.anIntArray335[local11 + this.anInt6117], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method5426(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(48) int local48;
		@Pc(54) int local54;
		if (this.anIntArray335 == null) {
			if (!this.aClass207_72.method4697(this.anInt6116, 0)) {
				return 0;
			}
			@Pc(28) byte[] local28 = this.aClass207_72.method4681(this.anInt6116, 0);
			if (local28 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub22_12.anInt6629 = 0;
			this.aClass5_Sub22_12.aByteArray71 = local28;
			local48 = local28.length >> 1;
			this.anIntArray335 = new int[local48];
			for (local54 = 0; local54 < local48; local54++) {
				this.anIntArray335[local54] = this.aClass5_Sub22_12.method5968();
			}
		}
		if (this.anIntArray335.length <= this.anInt6117) {
			return -1;
		}
		this.method5427();
		this.aClass5_Sub22_12.anInt6629 = 0;
		this.aClass5_Sub22_12.aByteArray71 = arg0;
		do {
			if (this.aClass5_Sub22_12.anInt6629 >= this.aClass5_Sub22_12.aByteArray71.length) {
				this.aClass5_Sub22_12.aByteArray71 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub22_11.aByteArray71 == null) {
				if (this.aByteArrayArray15[0] == null) {
					this.aClass5_Sub22_12.aByteArray71 = null;
					return this.aClass5_Sub22_12.anInt6629;
				}
				this.aClass5_Sub22_11.aByteArray71 = this.aByteArrayArray15[0];
			}
			@Pc(129) int local129 = this.aClass5_Sub22_12.aByteArray71.length - this.aClass5_Sub22_12.anInt6629;
			local48 = this.aClass5_Sub22_11.aByteArray71.length - this.aClass5_Sub22_11.anInt6629;
			if (local48 > local129) {
				this.aClass5_Sub22_11.method5915(this.aClass5_Sub22_12.anInt6629, local129, this.aClass5_Sub22_12.aByteArray71);
				this.aClass5_Sub22_12.aByteArray71 = null;
				return arg0.length;
			}
			this.aClass5_Sub22_12.method5925(this.aClass5_Sub22_11.aByteArray71, this.aClass5_Sub22_11.anInt6629, local48);
			this.aClass5_Sub22_11.anInt6629 = 0;
			this.aClass5_Sub22_11.aByteArray71 = null;
			this.anInt6117++;
			for (local54 = 0; local54 < 9; local54++) {
				this.aByteArrayArray15[local54] = this.aByteArrayArray15[local54 + 1];
			}
			this.aByteArrayArray15[9] = null;
		} while (this.anIntArray335.length > this.anInt6117);
		this.aClass5_Sub22_12.aByteArray71 = null;
		return this.aClass5_Sub22_12.anInt6629;
	}
}
