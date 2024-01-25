import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!g;")
	public static Class113 aClass113_4;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "[I")
	public static final int[] anIntArray330 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!km", name = "k", descriptor = "J")
	public static long aLong132 = 0L;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "[F")
	public static final float[] aFloatArray22 = new float[2];

	@OriginalMember(owner = "client!km", name = "q", descriptor = "J")
	public static final long aLong133 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZLclient!fw;I)Z")
	public static boolean method4105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13_Sub1_Sub4 arg2, @OriginalArg(4) int arg3) {
		if (!Static220.aBoolean257 || !Static436.aBoolean530) {
			return false;
		} else if (Static29.anInt690 < 100) {
			return false;
		} else if (Static223.method3048(arg0, arg3, arg1)) {
			@Pc(28) int local28 = arg3 << Static609.anInt9827;
			@Pc(32) int local32 = arg0 << Static609.anInt9827;
			@Pc(42) int local42 = Static314.aClass76Array2[arg1].method7396(arg0, arg3) - 1;
			@Pc(48) int local48 = arg2.method8397() + local42;
			if (arg2.aShort122 == 1) {
				if (!Static260.method3556(local28, local28, local32, local48, Static192.anInt3298 + local32, local42, local28, local32, local48)) {
					return false;
				} else if (Static260.method3556(local28, local28, Static192.anInt3298 + local32, local48, Static192.anInt3298 + local32, local42, local28, local32, local42)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 2) {
				if (!Static260.method3556(local28, local28, local32 + Static192.anInt3298, local48, Static192.anInt3298 + local32, local42, local28 + Static192.anInt3298, local32 + Static192.anInt3298, local48)) {
					return false;
				} else if (Static260.method3556(Static192.anInt3298 + local28, local28, Static192.anInt3298 + local32, local42, local32 + Static192.anInt3298, local42, local28 + Static192.anInt3298, local32 - -Static192.anInt3298, local48)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 4) {
				if (!Static260.method3556(local28 + Static192.anInt3298, Static192.anInt3298 + local28, local32, local48, Static192.anInt3298 + local32, local42, local28 + Static192.anInt3298, local32, local48)) {
					return false;
				} else if (Static260.method3556(local28 + Static192.anInt3298, Static192.anInt3298 + local28, local32 + Static192.anInt3298, local48, local32 + Static192.anInt3298, local42, local28 + Static192.anInt3298, local32, local42)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 8) {
				if (!Static260.method3556(local28, local28, local32, local48, local32, local42, Static192.anInt3298 + local28, local32, local48)) {
					return false;
				} else if (Static260.method3556(Static192.anInt3298 + local28, local28, local32, local42, local32, local42, local28 + Static192.anInt3298, local32, local48)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 16) {
				if (Static387.method5174(Static427.anInt6729 + local32, Static427.anInt6729, local28, local48, Static427.anInt6729, local42)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 32) {
				if (Static387.method5174(local32 + Static427.anInt6729, Static427.anInt6729, Static427.anInt6729 + local28, local48, Static427.anInt6729, local42)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 == 64) {
				if (Static387.method5174(local32, Static427.anInt6729, Static427.anInt6729 + local28, local48, Static427.anInt6729, local42)) {
					Static64.anInt1176++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort122 != 128) {
				return true;
			} else if (Static387.method5174(local32, Static427.anInt6729, local28, local48, Static427.anInt6729, local42)) {
				Static64.anInt1176++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
