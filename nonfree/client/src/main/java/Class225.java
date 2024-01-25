import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class225 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
	public boolean aBoolean479 = false;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Z")
	public boolean aBoolean481 = false;

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "Z")
	public boolean aBoolean480 = false;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!ega;")
	public Class3_Sub15 aClass3_Sub15_1 = null;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	public int anInt6624 = 0;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "([BLclient!ega;)V")
	public Class225(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		this.aClass3_Sub15_1 = arg1;
		try {
			@Pc(24) Class3_Sub9 local24 = new Class3_Sub9(arg0);
			@Pc(29) Class3_Sub9 local29 = new Class3_Sub9(arg0);
			local24.method5633();
			local24.anInt6453 += 2;
			@Pc(43) int local43 = local24.method5633();
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local29.anInt6453 = local24.anInt6453 + local43;
			@Pc(64) int local64;
			for (@Pc(57) int local57 = 0; local57 < local43; local57++) {
				local64 = this.aClass3_Sub15_1.anIntArray169[local57];
				if (local64 == 0) {
					local47 = local57;
				}
				@Pc(72) int local72 = local24.method5633();
				if (local72 > 0) {
					if (local64 == 0) {
						local49 = local57;
					}
					Static358.aShortArray77[local45] = (short) local57;
					@Pc(85) short local85 = 0;
					if (local64 == 3 || local64 == 10) {
						local85 = 128;
					}
					if ((local72 & 0x1) == 0) {
						Static358.aShortArray71[local45] = local85;
					} else {
						Static358.aShortArray71[local45] = (short) local29.method5608();
					}
					if ((local72 & 0x2) == 0) {
						Static358.aShortArray72[local45] = local85;
					} else {
						Static358.aShortArray72[local45] = (short) local29.method5608();
					}
					if ((local72 & 0x4) == 0) {
						Static358.aShortArray76[local45] = local85;
					} else {
						Static358.aShortArray76[local45] = (short) local29.method5608();
					}
					Static358.aByteArray55[local45] = (byte) (local72 >>> 3 & 0x3);
					if (local64 == 2 || local64 == 9) {
						Static358.aShortArray71[local45] = (short) (Static358.aShortArray71[local45] << 2 & 0x3FFF);
						Static358.aShortArray72[local45] = (short) (Static358.aShortArray72[local45] << 2 & 0x3FFF);
						Static358.aShortArray76[local45] = (short) (Static358.aShortArray76[local45] << 2 & 0x3FFF);
					}
					Static358.aShortArray70[local45] = -1;
					if (local64 == 1 || local64 == 2 || local64 == 3) {
						if (local47 > local49) {
							Static358.aShortArray70[local45] = (short) local47;
							local49 = local47;
						}
					} else if (local64 == 5) {
						this.aBoolean479 = true;
					} else if (local64 == 7) {
						this.aBoolean481 = true;
					} else if (local64 == 9 || local64 == 10 || local64 == 8) {
						this.aBoolean480 = true;
					}
					local45++;
				}
			}
			if (local29.anInt6453 != arg0.length) {
				throw new RuntimeException();
			}
			this.anInt6624 = local45;
			this.aShortArray79 = new short[local45];
			this.aShortArray78 = new short[local45];
			this.aShortArray74 = new short[local45];
			this.aShortArray73 = new short[local45];
			this.aShortArray75 = new short[local45];
			this.aByteArray56 = new byte[local45];
			for (local64 = 0; local64 < local45; local64++) {
				this.aShortArray79[local64] = Static358.aShortArray77[local64];
				this.aShortArray78[local64] = Static358.aShortArray71[local64];
				this.aShortArray74[local64] = Static358.aShortArray72[local64];
				this.aShortArray73[local64] = Static358.aShortArray76[local64];
				this.aShortArray75[local64] = Static358.aShortArray70[local64];
				this.aByteArray56[local64] = Static358.aByteArray55[local64];
			}
		} catch (@Pc(331) Exception local331) {
			this.anInt6624 = 0;
			this.aBoolean479 = false;
			this.aBoolean481 = false;
		}
	}
}
