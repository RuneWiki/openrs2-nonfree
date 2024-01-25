import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nea")
public final class Class245 {

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "I")
	public int anInt6541;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	public int anInt6544;

	@OriginalMember(owner = "client!nea", name = "i", descriptor = "Lclient!lh;")
	public Class208 aClass208_6;

	@OriginalMember(owner = "client!nea", name = "l", descriptor = "Z")
	public boolean aBoolean453 = false;

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!dt;I)V")
	public void method5494(@OriginalArg(0) Class3_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7954();
			if (local17 == 0) {
				return;
			}
			this.method5497(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(Lclient!ha;IZZ)Lclient!hh;")
	public Class6 method5496(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(24) long local24 = (long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.anInt6544 | arg0.anInt9840 << 19);
		@Pc(32) Class6 local32 = (Class6) this.aClass208_6.aClass295_32.method6470(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass208_6.aClass362_70.method8365(this.anInt6544)) {
			@Pc(60) Class370 local60 = Static688.method8590(this.aClass208_6.aClass362_70, this.anInt6544, 0);
			if (local60 != null) {
				local60.anInt10495 = local60.anInt10493 = local60.anInt10492 = local60.anInt10494 = 0;
				if (arg2) {
					local60.method8592();
				}
				for (@Pc(80) int local80 = 0; local80 < arg1; local80++) {
					local60.method8598();
				}
			}
			local32 = arg0.method8008(local60, true);
			if (local32 != null) {
				this.aClass208_6.aClass295_32.method6469(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(ILclient!dt;B)V")
	private void method5497(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt6544 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt6541 = arg1.method7945();
		} else if (arg0 == 3) {
			this.aBoolean453 = true;
		} else if (arg0 == 4) {
			this.anInt6544 = -1;
		}
	}

	@OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)Z")
	public boolean method5499() {
		return this.aClass208_6.aClass362_70.method8365(this.anInt6544);
	}
}
