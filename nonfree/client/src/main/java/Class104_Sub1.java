import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!eq", name = "Q", descriptor = "I")
	private int anInt2331;

	@OriginalMember(owner = "client!eq", name = "T", descriptor = "[I")
	private int[] anIntArray118;

	@OriginalMember(owner = "client!eq", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray6 = new byte[10][];

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "Lclient!rv;")
	private final Class5_Sub15 aClass5_Sub15_2 = new Class5_Sub15((byte[]) null);

	@OriginalMember(owner = "client!eq", name = "U", descriptor = "Lclient!rv;")
	private final Class5_Sub15 aClass5_Sub15_3 = new Class5_Sub15((byte[]) null);

	@OriginalMember(owner = "client!eq", name = "R", descriptor = "I")
	private final int anInt2332;

	@OriginalMember(owner = "client!eq", name = "O", descriptor = "Lclient!cb;")
	private final Class50 aClass50_39;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(ILclient!cb;I)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt2332 = arg2;
		this.aClass50_39 = arg1;
	}

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "(I)V")
	public void method2102() {
		if (this.anIntArray118 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10 && this.anIntArray118.length > this.anInt2331 + local11; local11++) {
			if (this.aByteArrayArray6[local11] == null && this.aClass50_39.method901(0, this.anIntArray118[this.anInt2331 + local11])) {
				this.aByteArrayArray6[local11] = this.aClass50_39.method916(0, this.anIntArray118[local11 + this.anInt2331]);
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B[B)I")
	@Override
	protected int method2088(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray118 == null) {
			if (!this.aClass50_39.method901(0, this.anInt2332)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass50_39.method916(0, this.anInt2332);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub15_3.anInt4144 = 0;
			this.aClass5_Sub15_3.aByteArray45 = local26;
			local46 = local26.length >> 1;
			this.anIntArray118 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray118[local52] = this.aClass5_Sub15_3.method3698();
			}
		}
		if (this.anIntArray118.length <= this.anInt2331) {
			return -1;
		}
		this.method2102();
		this.aClass5_Sub15_3.anInt4144 = 0;
		this.aClass5_Sub15_3.aByteArray45 = arg0;
		do {
			if (this.aClass5_Sub15_3.aByteArray45.length <= this.aClass5_Sub15_3.anInt4144) {
				this.aClass5_Sub15_3.aByteArray45 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub15_2.aByteArray45 == null) {
				if (this.aByteArrayArray6[0] == null) {
					this.aClass5_Sub15_3.aByteArray45 = null;
					return this.aClass5_Sub15_3.anInt4144;
				}
				this.aClass5_Sub15_2.aByteArray45 = this.aByteArrayArray6[0];
			}
			@Pc(126) int local126 = this.aClass5_Sub15_3.aByteArray45.length - this.aClass5_Sub15_3.anInt4144;
			local46 = this.aClass5_Sub15_2.aByteArray45.length - this.aClass5_Sub15_2.anInt4144;
			if (local46 > local126) {
				this.aClass5_Sub15_2.method3650(this.aClass5_Sub15_3.anInt4144, local126, this.aClass5_Sub15_3.aByteArray45);
				this.aClass5_Sub15_3.aByteArray45 = null;
				return arg0.length;
			}
			this.aClass5_Sub15_3.method3685(this.aClass5_Sub15_2.aByteArray45, local46, this.aClass5_Sub15_2.anInt4144);
			this.anInt2331++;
			this.aClass5_Sub15_2.anInt4144 = 0;
			this.aClass5_Sub15_2.aByteArray45 = null;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray6[local52] = this.aByteArrayArray6[local52 + 1];
			}
			this.aByteArrayArray6[9] = null;
		} while (this.anInt2331 < this.anIntArray118.length);
		this.aClass5_Sub15_3.aByteArray45 = null;
		return this.aClass5_Sub15_3.anInt4144;
	}
}
