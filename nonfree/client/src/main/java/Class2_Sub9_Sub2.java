import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class2_Sub9_Sub2 extends Class2_Sub9 {

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "[Lclient!li;")
	public Class127[] aClass127Array1;

	@OriginalMember(owner = "client!dm", name = "W", descriptor = "[[B")
	private byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
	private final int anInt1126;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub9_Sub2(@OriginalArg(0) int arg0) {
		this.anInt1126 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Z")
	public boolean method1314(@OriginalArg(1) int arg0) {
		return this.aClass127Array1[arg0].aBoolean345;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Z")
	public boolean method1315(@OriginalArg(0) int arg0) {
		return this.aClass127Array1[arg0].aBoolean346;
	}

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "(I)Z")
	public boolean method1319() {
		if (this.aClass127Array1 != null) {
			return true;
		}
		@Pc(36) int local36;
		if (this.aByteArrayArray1 == null) {
			if (!Static20.aClass104_16.method2746(this.anInt1126)) {
				return false;
			}
			@Pc(29) int[] local29 = Static20.aClass104_16.method2763(this.anInt1126);
			this.aByteArrayArray1 = new byte[local29.length][];
			for (local36 = 0; local36 < local29.length; local36++) {
				this.aByteArrayArray1[local36] = Static20.aClass104_16.method2756(this.anInt1126, local29[local36]);
			}
		}
		@Pc(57) boolean local57 = true;
		@Pc(80) int local80;
		for (local36 = 0; local36 < this.aByteArrayArray1.length; local36++) {
			@Pc(66) byte[] local66 = this.aByteArrayArray1[local36];
			local80 = (local66[0] & 0xFF) << 8 | local66[1] & 0xFF;
			local57 &= Static19.aClass104_15.method2755(local80);
		}
		if (!local57) {
			return false;
		}
		@Pc(103) Class180 local103 = new Class180();
		local80 = Static20.aClass104_16.method2745(this.anInt1126);
		this.aClass127Array1 = new Class127[local80];
		@Pc(119) int[] local119 = Static20.aClass104_16.method2763(this.anInt1126);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray1[local121];
			@Pc(142) int local142 = (local128[0] & 0xFF) << 8 | local128[1] & 0xFF;
			@Pc(144) Class2_Sub4 local144 = null;
			for (@Pc(149) Class2_Sub4 local149 = (Class2_Sub4) local103.method4919(); local149 != null; local149 = (Class2_Sub4) local103.method4916()) {
				if (local149.anInt168 == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class2_Sub4(local142, Static19.aClass104_15.method2758(local142));
				local103.method4909(local144);
			}
			this.aClass127Array1[local119[local121]] = new Class127(local128, local144);
		}
		this.aByteArrayArray1 = null;
		return true;
	}
}
