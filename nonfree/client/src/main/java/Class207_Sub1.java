import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vaa")
public final class Class207_Sub1 extends Class207 {

	@OriginalMember(owner = "client!vaa", name = "L", descriptor = "[I")
	private int[] anIntArray552;

	@OriginalMember(owner = "client!vaa", name = "P", descriptor = "I")
	private int anInt10386;

	@OriginalMember(owner = "client!vaa", name = "K", descriptor = "[[B")
	private final byte[][] aByteArrayArray26 = new byte[10][];

	@OriginalMember(owner = "client!vaa", name = "H", descriptor = "Lclient!dt;")
	private final Class3_Sub4 aClass3_Sub4_6 = new Class3_Sub4((byte[]) null);

	@OriginalMember(owner = "client!vaa", name = "R", descriptor = "Lclient!dt;")
	private final Class3_Sub4 aClass3_Sub4_7 = new Class3_Sub4((byte[]) null);

	@OriginalMember(owner = "client!vaa", name = "O", descriptor = "Lclient!uq;")
	private final Class362 aClass362_149;

	@OriginalMember(owner = "client!vaa", name = "J", descriptor = "I")
	private final int anInt10385;

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(ILclient!uq;I)V")
	public Class207_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass362_149 = arg1;
		this.anInt10385 = arg2;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I[B)I")
	@Override
	protected int method8475(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(50) int local50;
		@Pc(56) int local56;
		if (this.anIntArray552 == null) {
			if (!this.aClass362_149.method8354(this.anInt10385, 0)) {
				return 0;
			}
			@Pc(30) byte[] local30 = this.aClass362_149.method8368(this.anInt10385, 0);
			if (local30 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub4_7.aByteArray90 = local30;
			this.aClass3_Sub4_7.anInt9739 = 0;
			local50 = local30.length >> 1;
			this.anIntArray552 = new int[local50];
			for (local56 = 0; local56 < local50; local56++) {
				this.anIntArray552[local56] = this.aClass3_Sub4_7.method7951();
			}
		}
		if (this.anInt10386 >= this.anIntArray552.length) {
			return -1;
		}
		this.method8478();
		this.aClass3_Sub4_7.anInt9739 = 0;
		this.aClass3_Sub4_7.aByteArray90 = arg0;
		do {
			if (this.aClass3_Sub4_7.anInt9739 >= this.aClass3_Sub4_7.aByteArray90.length) {
				this.aClass3_Sub4_7.aByteArray90 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub4_6.aByteArray90 == null) {
				if (this.aByteArrayArray26[0] == null) {
					this.aClass3_Sub4_7.aByteArray90 = null;
					return this.aClass3_Sub4_7.anInt9739;
				}
				this.aClass3_Sub4_6.aByteArray90 = this.aByteArrayArray26[0];
			}
			@Pc(134) int local134 = this.aClass3_Sub4_7.aByteArray90.length - this.aClass3_Sub4_7.anInt9739;
			local50 = this.aClass3_Sub4_6.aByteArray90.length - this.aClass3_Sub4_6.anInt9739;
			if (local50 > local134) {
				this.aClass3_Sub4_6.method7958(this.aClass3_Sub4_7.anInt9739, this.aClass3_Sub4_7.aByteArray90, local134);
				this.aClass3_Sub4_7.aByteArray90 = null;
				return arg0.length;
			}
			this.aClass3_Sub4_7.method7939(this.aClass3_Sub4_6.aByteArray90, local50, this.aClass3_Sub4_6.anInt9739);
			this.aClass3_Sub4_6.anInt9739 = 0;
			this.aClass3_Sub4_6.aByteArray90 = null;
			this.anInt10386++;
			for (local56 = 0; local56 < 9; local56++) {
				this.aByteArrayArray26[local56] = this.aByteArrayArray26[local56 + 1];
			}
			this.aByteArrayArray26[9] = null;
		} while (this.anIntArray552.length > this.anInt10386);
		this.aClass3_Sub4_7.aByteArray90 = null;
		return this.aClass3_Sub4_7.anInt9739;
	}

	@OriginalMember(owner = "client!vaa", name = "g", descriptor = "(I)V")
	public void method8478() {
		if (this.anIntArray552 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anInt10386 + local15 >= this.anIntArray552.length) {
				return;
			}
			if (this.aByteArrayArray26[local15] == null && this.aClass362_149.method8354(this.anIntArray552[this.anInt10386 + local15], 0)) {
				this.aByteArrayArray26[local15] = this.aClass362_149.method8368(this.anIntArray552[local15 + this.anInt10386], 0);
			}
		}
	}
}
