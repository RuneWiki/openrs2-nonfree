import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class275_Sub1 extends Class275 {

	@OriginalMember(owner = "client!ov", name = "O", descriptor = "I")
	private int anInt7271;

	@OriginalMember(owner = "client!ov", name = "P", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "[[B")
	private final byte[][] aByteArrayArray17 = new byte[10][];

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_4 = new Class5_Sub36((byte[]) null);

	@OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_5 = new Class5_Sub36((byte[]) null);

	@OriginalMember(owner = "client!ov", name = "M", descriptor = "Lclient!gda;")
	private final Class126 aClass126_204;

	@OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
	private final int anInt7272;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(ILclient!gda;I)V")
	public Class275_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass126_204 = arg1;
		this.anInt7272 = arg2;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method6313(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray433 == null) {
			if (!this.aClass126_204.method3068(this.anInt7272, 0)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass126_204.method3086(0, this.anInt7272);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass5_Sub36_5.aByteArray89 = local29;
			this.aClass5_Sub36_5.anInt8456 = 0;
			local50 = local29.length >> 1;
			this.anIntArray433 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray433[local56] = this.aClass5_Sub36_5.method7333();
			}
		}
		if (this.anIntArray433.length <= this.anInt7271) {
			return -1;
		}
		this.method6329();
		this.aClass5_Sub36_5.aByteArray89 = arg0;
		this.aClass5_Sub36_5.anInt8456 = 0;
		do {
			if (this.aClass5_Sub36_5.aByteArray89.length <= this.aClass5_Sub36_5.anInt8456) {
				this.aClass5_Sub36_5.aByteArray89 = null;
				return arg0.length;
			}
			if (this.aClass5_Sub36_4.aByteArray89 == null) {
				if (this.aByteArrayArray17[0] == null) {
					this.aClass5_Sub36_5.aByteArray89 = null;
					return this.aClass5_Sub36_5.anInt8456;
				}
				this.aClass5_Sub36_4.aByteArray89 = this.aByteArrayArray17[0];
			}
			@Pc(143) int local143 = this.aClass5_Sub36_5.aByteArray89.length - this.aClass5_Sub36_5.anInt8456;
			local50 = this.aClass5_Sub36_4.aByteArray89.length - this.aClass5_Sub36_4.anInt8456;
			if (local50 > local143) {
				this.aClass5_Sub36_4.method7297(this.aClass5_Sub36_5.aByteArray89, this.aClass5_Sub36_5.anInt8456, local143);
				this.aClass5_Sub36_5.aByteArray89 = null;
				return arg0.length;
			}
			this.aClass5_Sub36_5.method7313(this.aClass5_Sub36_4.anInt8456, local50, this.aClass5_Sub36_4.aByteArray89);
			this.aClass5_Sub36_4.anInt8456 = 0;
			this.aClass5_Sub36_4.aByteArray89 = null;
			this.anInt7271++;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray17[local56] = this.aByteArrayArray17[local56 + 1];
			}
			this.aByteArrayArray17[9] = null;
		} while (this.anIntArray433.length > this.anInt7271);
		this.aClass5_Sub36_5.aByteArray89 = null;
		return this.aClass5_Sub36_5.anInt8456;
	}

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "(B)V")
	public void method6329() {
		if (this.anIntArray433 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			if (this.anInt7271 + local20 >= this.anIntArray433.length) {
				return;
			}
			if (this.aByteArrayArray17[local20] == null && this.aClass126_204.method3068(this.anIntArray433[this.anInt7271 + local20], 0)) {
				this.aByteArrayArray17[local20] = this.aClass126_204.method3086(0, this.anIntArray433[this.anInt7271 + local20]);
			}
		}
	}
}
