import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class172_Sub1 extends Class172 {

	@OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
	private int anInt8156;

	@OriginalMember(owner = "client!qv", name = "L", descriptor = "[I")
	private int[] anIntArray497;

	@OriginalMember(owner = "client!qv", name = "G", descriptor = "[[B")
	private final byte[][] aByteArrayArray19 = new byte[10][];

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "Lclient!dc;")
	private final Class3_Sub9 aClass3_Sub9_9 = new Class3_Sub9((byte[]) null);

	@OriginalMember(owner = "client!qv", name = "O", descriptor = "Lclient!dc;")
	private final Class3_Sub9 aClass3_Sub9_10 = new Class3_Sub9((byte[]) null);

	@OriginalMember(owner = "client!qv", name = "K", descriptor = "Lclient!uu;")
	private final Class343 aClass343_227;

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "I")
	private final int anInt8154;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(ILclient!uu;I)V")
	public Class172_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass343_227 = arg1;
		this.anInt8154 = arg2;
	}

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "(I)V")
	public void method7054() {
		if (this.anIntArray497 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			if (this.anIntArray497.length <= this.anInt8156 + local11) {
				return;
			}
			if (this.aByteArrayArray19[local11] == null && this.aClass343_227.method8130(this.anIntArray497[this.anInt8156 + local11], 0)) {
				this.aByteArrayArray19[local11] = this.aClass343_227.method8132(this.anIntArray497[this.anInt8156 + local11], 0);
			}
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "([BI)I")
	@Override
	protected int method7042(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(51) int local51;
		@Pc(57) int local57;
		if (this.anIntArray497 == null) {
			if (!this.aClass343_227.method8130(this.anInt8154, 0)) {
				return 0;
			}
			@Pc(31) byte[] local31 = this.aClass343_227.method8132(this.anInt8154, 0);
			if (local31 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub9_10.anInt6453 = 0;
			this.aClass3_Sub9_10.aByteArray51 = local31;
			local51 = local31.length >> 1;
			this.anIntArray497 = new int[local51];
			for (local57 = 0; local57 < local51; local57++) {
				this.anIntArray497[local57] = this.aClass3_Sub9_10.method5610();
			}
		}
		if (this.anInt8156 >= this.anIntArray497.length) {
			return -1;
		}
		this.method7054();
		this.aClass3_Sub9_10.aByteArray51 = arg0;
		this.aClass3_Sub9_10.anInt6453 = 0;
		do {
			if (this.aClass3_Sub9_10.anInt6453 >= this.aClass3_Sub9_10.aByteArray51.length) {
				this.aClass3_Sub9_10.aByteArray51 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub9_9.aByteArray51 == null) {
				if (this.aByteArrayArray19[0] == null) {
					this.aClass3_Sub9_10.aByteArray51 = null;
					return this.aClass3_Sub9_10.anInt6453;
				}
				this.aClass3_Sub9_9.aByteArray51 = this.aByteArrayArray19[0];
			}
			@Pc(125) int local125 = this.aClass3_Sub9_10.aByteArray51.length - this.aClass3_Sub9_10.anInt6453;
			local51 = this.aClass3_Sub9_9.aByteArray51.length - this.aClass3_Sub9_9.anInt6453;
			if (local125 < local51) {
				this.aClass3_Sub9_9.method5577(this.aClass3_Sub9_10.anInt6453, local125, this.aClass3_Sub9_10.aByteArray51);
				this.aClass3_Sub9_10.aByteArray51 = null;
				return arg0.length;
			}
			this.aClass3_Sub9_10.method5625(this.aClass3_Sub9_9.aByteArray51, local51, this.aClass3_Sub9_9.anInt6453);
			this.anInt8156++;
			this.aClass3_Sub9_9.anInt6453 = 0;
			this.aClass3_Sub9_9.aByteArray51 = null;
			for (local57 = 0; local57 < 9; local57++) {
				this.aByteArrayArray19[local57] = this.aByteArrayArray19[local57 + 1];
			}
			this.aByteArrayArray19[9] = null;
		} while (this.anInt8156 < this.anIntArray497.length);
		this.aClass3_Sub9_10.aByteArray51 = null;
		return this.aClass3_Sub9_10.anInt6453;
	}
}
