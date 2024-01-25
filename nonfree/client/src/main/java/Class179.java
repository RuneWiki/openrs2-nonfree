import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class179 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Lclient!aba;")
	public Class3 aClass3_3;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public int anInt5133;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public int anInt5139;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Z")
	public boolean aBoolean363 = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BZLclient!oa;I)Lclient!xa;")
	public Class58 method4414(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(24) long local24 = (long) (this.anInt5139 | arg2 << 16 | (arg0 ? 262144 : 0) | arg1.anInt8396 << 19);
		@Pc(32) Class58 local32 = (Class58) this.aClass3_3.aClass136_2.method3473(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass3_3.aClass251_3.method5782(this.anInt5139)) {
			@Pc(54) Class140 local54 = Static604.method3623(this.aClass3_3.aClass251_3, this.anInt5139, 0);
			if (local54 != null) {
				local54.anInt4128 = local54.anInt4125 = local54.anInt4124 = local54.anInt4126 = 0;
				if (arg0) {
					local54.method3617();
				}
				for (@Pc(74) int local74 = 0; local74 < arg2; local74++) {
					local54.method3616();
				}
			}
			local32 = arg1.method6889(local54, true);
			if (local32 != null) {
				this.aClass3_3.aClass136_2.method3482(local24, local32);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ji;B)V")
	public void method4417(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6069();
			if (local16 == 0) {
				return;
			}
			this.method4418(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!ji;B)V")
	private void method4418(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt5139 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt5133 = arg1.method6031();
		} else if (arg0 == 3) {
			this.aBoolean363 = true;
		} else if (arg0 == 4) {
			this.anInt5139 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
	public boolean method4419() {
		return this.aClass3_3.aClass251_3.method5782(this.anInt5139);
	}
}
