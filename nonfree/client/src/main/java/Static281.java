import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIB)Lclient!kv;")
	public static Class4_Sub6 method4512(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class387[] local13 = Class231.aClass387Array1;
		synchronized (Class231.aClass387Array1) {
			@Pc(33) Class4_Sub6 local33;
			if (Class231.aClass387Array1.length <= arg1 || Class231.aClass387Array1[arg1].method9020()) {
				local33 = new Class4_Sub6();
				local33.aClass4_Sub8Array1 = new Class4_Sub8[arg1];
				for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
					local33.aClass4_Sub8Array1[local39] = new Class4_Sub8();
				}
			} else {
				local33 = (Class4_Sub6) Class231.aClass387Array1[arg1].method9012();
				local33.method8570();
				@Pc(78) int local78 = Static17.anIntArray27[arg1]--;
			}
			local33.aBoolean352 = arg0;
			return local33;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	public static int method4513(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}
}
