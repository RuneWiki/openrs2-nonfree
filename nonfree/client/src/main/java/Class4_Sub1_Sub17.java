import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class4_Sub1_Sub17 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!pt", name = "F", descriptor = "[Lclient!gr;")
	public Class88[] aClass88Array1;

	@OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
	private final int anInt5488;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(I)V")
	public Class4_Sub1_Sub17(@OriginalArg(0) int arg0) {
		this.anInt5488 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Z")
	public boolean method4207(@OriginalArg(1) int arg0) {
		return this.aClass88Array1[arg0].aBoolean252;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)Z")
	public boolean method4211() {
		if (this.aClass88Array1 != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray24 == null) {
			if (!Static10.aClass76_1.method2101(this.anInt5488)) {
				return false;
			}
			@Pc(27) int[] local27 = Static10.aClass76_1.method2124(this.anInt5488);
			this.aByteArrayArray24 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray24[local34] = Static10.aClass76_1.method2104(local27[local34], this.anInt5488);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray24.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray24[local34];
			local78 = (local64[0] & 0xFF) << 8 | local64[1] & 0xFF;
			local55 &= Static414.aClass76_96.method2125(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) Class183 local103 = new Class183();
		local78 = Static10.aClass76_1.method2108(this.anInt5488);
		this.aClass88Array1 = new Class88[local78];
		@Pc(119) int[] local119 = Static10.aClass76_1.method2124(this.anInt5488);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray24[local121];
			@Pc(142) int local142 = local128[1] & 0xFF | (local128[0] & 0xFF) << 8;
			@Pc(144) Class4_Sub32 local144 = null;
			for (@Pc(149) Class4_Sub32 local149 = (Class4_Sub32) local103.method4140(); local149 != null; local149 = (Class4_Sub32) local103.method4144()) {
				if (local149.anInt4984 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class4_Sub32(local142, Static414.aClass76_96.method2122(local142));
				local103.method4137(local144);
			}
			this.aClass88Array1[local119[local121]] = new Class88(local128, local144);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Z")
	public boolean method4214(@OriginalArg(1) int arg0) {
		return this.aClass88Array1[arg0].aBoolean251;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)Z")
	public boolean method4215(@OriginalArg(0) int arg0) {
		return this.aClass88Array1[arg0].aBoolean250;
	}
}
