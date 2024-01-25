import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class115_Sub1 extends Class115 {

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	private int anInt3444;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "[I")
	private int[] anIntArray182;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "[[B")
	private final byte[][] aByteArrayArray58 = new byte[10][];

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_50 = new Class6_Sub15((byte[]) null);

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "Lclient!jc;")
	private final Class6_Sub15 aClass6_Sub15_51 = new Class6_Sub15((byte[]) null);

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	private final int anInt3443;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "Lclient!lga;")
	private final Class223 aClass223_29;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(ILclient!lga;I)V")
	public Class115_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt3443 = arg2;
		this.aClass223_29 = arg1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BI)I")
	@Override
	protected int method3249(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray182 == null) {
			if (!this.aClass223_29.method5261(this.anInt3443, 0)) {
				return 0;
			}
			@Pc(29) byte[] local29 = this.aClass223_29.method5267(0, this.anInt3443);
			if (local29 == null) {
				throw new IllegalStateException("");
			}
			this.aClass6_Sub15_51.aByteArray20 = local29;
			this.aClass6_Sub15_51.anInt3174 = 0;
			local50 = local29.length >> 1;
			this.anIntArray182 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray182[local56] = this.aClass6_Sub15_51.method3018();
			}
		}
		if (this.anIntArray182.length <= this.anInt3444) {
			return -1;
		}
		this.method3257();
		this.aClass6_Sub15_51.aByteArray20 = arg0;
		this.aClass6_Sub15_51.anInt3174 = 0;
		do {
			if (this.aClass6_Sub15_51.aByteArray20.length <= this.aClass6_Sub15_51.anInt3174) {
				this.aClass6_Sub15_51.aByteArray20 = null;
				return arg0.length;
			}
			if (this.aClass6_Sub15_50.aByteArray20 == null) {
				if (this.aByteArrayArray58[0] == null) {
					this.aClass6_Sub15_51.aByteArray20 = null;
					return this.aClass6_Sub15_51.anInt3174;
				}
				this.aClass6_Sub15_50.aByteArray20 = this.aByteArrayArray58[0];
			}
			@Pc(141) int local141 = this.aClass6_Sub15_51.aByteArray20.length - this.aClass6_Sub15_51.anInt3174;
			local50 = this.aClass6_Sub15_50.aByteArray20.length - this.aClass6_Sub15_50.anInt3174;
			if (local50 > local141) {
				this.aClass6_Sub15_50.method3019(local141, this.aClass6_Sub15_51.anInt3174, this.aClass6_Sub15_51.aByteArray20);
				this.aClass6_Sub15_51.aByteArray20 = null;
				return arg0.length;
			}
			this.aClass6_Sub15_51.method2988(this.aClass6_Sub15_50.anInt3174, this.aClass6_Sub15_50.aByteArray20, local50);
			this.aClass6_Sub15_50.anInt3174 = 0;
			this.anInt3444++;
			this.aClass6_Sub15_50.aByteArray20 = null;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray58[local56] = this.aByteArrayArray58[local56 + 1];
			}
			this.aByteArrayArray58[9] = null;
		} while (this.anIntArray182.length > this.anInt3444);
		this.aClass6_Sub15_51.aByteArray20 = null;
		return this.aClass6_Sub15_51.anInt3174;
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(B)V")
	public void method3257() {
		if (this.anIntArray182 == null) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			if (this.anIntArray182.length <= this.anInt3444 + local20) {
				return;
			}
			if (this.aByteArrayArray58[local20] == null && this.aClass223_29.method5261(this.anIntArray182[this.anInt3444 + local20], 0)) {
				this.aByteArrayArray58[local20] = this.aClass223_29.method5267(0, this.anIntArray182[local20 + this.anInt3444]);
			}
		}
	}
}
