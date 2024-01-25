import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "Lclient!mn;")
	public static Class171 aClass171_71;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_31 = new Class181();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method4762(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static206.anInt3554 > 0) {
			local18 = Static379.aByteArrayArray14[--Static206.anInt3554];
			Static379.aByteArrayArray14[Static206.anInt3554] = null;
			return local18;
		} else if (arg0 == 5000 && Static31.anInt3294 > 0) {
			local18 = Static455.aByteArrayArray22[--Static31.anInt3294];
			Static455.aByteArrayArray22[Static31.anInt3294] = null;
			return local18;
		} else if (arg0 == 30000 && Static281.anInt4445 > 0) {
			local18 = Static174.aByteArrayArray10[--Static281.anInt4445];
			Static174.aByteArrayArray10[Static281.anInt4445] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BII)B")
	public static byte method4764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLclient!gi;I)I")
	public static int method4765(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		if (!Static53.method860(arg0).method5898(arg1) && arg0.anObjectArray10 == null) {
			return -1;
		} else if (arg0.anIntArray205 == null || arg0.anIntArray205.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray205[arg1];
		}
	}
}
