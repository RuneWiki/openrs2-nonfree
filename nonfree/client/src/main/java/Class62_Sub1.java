import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dha")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!dha", name = "E", descriptor = "[I")
	private int[] anIntArray95;

	@OriginalMember(owner = "client!dha", name = "L", descriptor = "I")
	private int anInt2851;

	@OriginalMember(owner = "client!dha", name = "G", descriptor = "[[B")
	private final byte[][] aByteArrayArray4 = new byte[10][];

	@OriginalMember(owner = "client!dha", name = "I", descriptor = "Lclient!ji;")
	private final Class6_Sub8 aClass6_Sub8_1 = new Class6_Sub8((byte[]) null);

	@OriginalMember(owner = "client!dha", name = "P", descriptor = "Lclient!ji;")
	private final Class6_Sub8 aClass6_Sub8_2 = new Class6_Sub8((byte[]) null);

	@OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
	private final int anInt2849;

	@OriginalMember(owner = "client!dha", name = "N", descriptor = "Lclient!ni;")
	private final Class223 aClass223_37;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(ILclient!ni;I)V")
	public Class62_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt2849 = arg2;
		this.aClass223_37 = arg1;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method2403(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray95 == null) {
			if (!this.aClass223_37.method5960(0, this.anInt2849)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass223_37.method5954(0, this.anInt2849);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass6_Sub8_2.aByteArray102 = local26;
			this.aClass6_Sub8_2.anInt10061 = 0;
			local46 = local26.length >> 1;
			this.anIntArray95 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray95[local52] = this.aClass6_Sub8_2.method8220();
			}
		}
		if (this.anIntArray95.length <= this.anInt2851) {
			return -1;
		}
		this.method2420();
		this.aClass6_Sub8_2.anInt10061 = 0;
		this.aClass6_Sub8_2.aByteArray102 = arg0;
		do {
			if (this.aClass6_Sub8_2.anInt10061 >= this.aClass6_Sub8_2.aByteArray102.length) {
				this.aClass6_Sub8_2.aByteArray102 = null;
				return arg0.length;
			}
			if (this.aClass6_Sub8_1.aByteArray102 == null) {
				if (this.aByteArrayArray4[0] == null) {
					this.aClass6_Sub8_2.aByteArray102 = null;
					return this.aClass6_Sub8_2.anInt10061;
				}
				this.aClass6_Sub8_1.aByteArray102 = this.aByteArrayArray4[0];
			}
			@Pc(135) int local135 = this.aClass6_Sub8_2.aByteArray102.length - this.aClass6_Sub8_2.anInt10061;
			local46 = this.aClass6_Sub8_1.aByteArray102.length - this.aClass6_Sub8_1.anInt10061;
			if (local135 < local46) {
				this.aClass6_Sub8_1.method8207(this.aClass6_Sub8_2.aByteArray102, local135, this.aClass6_Sub8_2.anInt10061);
				this.aClass6_Sub8_2.aByteArray102 = null;
				return arg0.length;
			}
			this.aClass6_Sub8_2.method8234(this.aClass6_Sub8_1.aByteArray102, local46, this.aClass6_Sub8_1.anInt10061);
			this.aClass6_Sub8_1.aByteArray102 = null;
			this.aClass6_Sub8_1.anInt10061 = 0;
			this.anInt2851++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray4[local52] = this.aByteArrayArray4[local52 + 1];
			}
			this.aByteArrayArray4[9] = null;
		} while (this.anInt2851 < this.anIntArray95.length);
		this.aClass6_Sub8_2.aByteArray102 = null;
		return this.aClass6_Sub8_2.anInt10061;
	}

	@OriginalMember(owner = "client!dha", name = "e", descriptor = "(B)V")
	public void method2420() {
		if (this.anIntArray95 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 10; local16++) {
			if (this.anInt2851 + local16 >= this.anIntArray95.length) {
				return;
			}
			if (this.aByteArrayArray4[local16] == null && this.aClass223_37.method5960(0, this.anIntArray95[this.anInt2851 + local16])) {
				this.aByteArrayArray4[local16] = this.aClass223_37.method5954(0, this.anIntArray95[local16 + this.anInt2851]);
			}
		}
	}
}
