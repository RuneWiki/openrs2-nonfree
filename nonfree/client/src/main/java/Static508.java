import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
	public static int anInt8494 = 4;

	@OriginalMember(owner = "client!rc", name = "z", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_121 = new Class376(6, 4);

	@OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
	public static int anInt8496 = 0;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!uv;I)V")
	public static void method7190(@OriginalArg(0) Class23_Sub2_Sub1_Sub2 arg0) {
		if (arg0.anInt10148 != -1) {
			@Pc(11) Class48 local11 = Static483.aClass373_2.method8323(arg0.anInt10148);
			if (local11 == null || local11.anIntArray72 == null) {
				arg0.aBoolean748 = false;
				arg0.anInt10148 = -1;
			} else {
				label277: {
					arg0.anInt10138++;
					if (local11.anIntArray72.length > arg0.anInt10183 && arg0.anInt10138 > local11.anIntArray68[arg0.anInt10183]) {
						arg0.anInt10177++;
						arg0.anInt10183++;
						arg0.anInt10138 = 1;
						if (!arg0.aBoolean747) {
							Static4.method49(arg0, local11, arg0.anInt10183);
						}
					}
					if (arg0.anInt10183 >= local11.anIntArray72.length) {
						arg0.anInt10138 = 0;
						arg0.anInt10183 = 0;
						if (arg0.aBoolean748) {
							arg0.anInt10148 = arg0.method8630().method7964();
							if (arg0.anInt10148 == -1) {
								arg0.aBoolean748 = false;
								break label277;
							}
							local11 = Static483.aClass373_2.method8323(arg0.anInt10148);
						}
						if (!arg0.aBoolean747) {
							Static4.method49(arg0, local11, arg0.anInt10183);
						}
					}
					arg0.anInt10177 = arg0.anInt10183 + 1;
					if (local11.anIntArray72 == null) {
						arg0.aBoolean748 = false;
						arg0.anInt10148 = -1;
					} else if (arg0.anInt10177 >= local11.anIntArray72.length) {
						arg0.anInt10177 = 0;
					}
				}
			}
		}
		@Pc(188) Class48 local188;
		for (@Pc(146) int local146 = 0; local146 < arg0.aClass375Array3.length; local146++) {
			if (arg0.aClass375Array3[local146].anInt9871 != -1 && arg0.aClass375Array3[local146].anInt9870 <= Static621.anInt9665) {
				@Pc(176) Class34 local176 = Static196.aClass315_2.method7420(arg0.aClass375Array3[local146].anInt9871);
				@Pc(179) int local179 = local176.anInt1217;
				if (local179 == -1) {
					arg0.aClass375Array3[local146].anInt9871 = -1;
				} else {
					local188 = Static483.aClass373_2.method8323(local179);
					if (local176.aBoolean105) {
						if (local188.anInt1555 == 3) {
							if (arg0.anInt10189 > 0 && Static621.anInt9665 >= arg0.anInt10151 && arg0.anInt10162 < Static621.anInt9665) {
								arg0.aClass375Array3[local146].anInt9871 = -1;
								continue;
							}
						} else if (local188.anInt1555 == 1 && arg0.anInt10189 > 0 && Static621.anInt9665 >= arg0.anInt10151 && Static621.anInt9665 > arg0.anInt10162) {
							arg0.aClass375Array3[local146].anInt9870 = Static621.anInt9665 + 1;
							continue;
						}
					}
					if (local188 == null || local188.anIntArray72 == null) {
						arg0.aClass375Array3[local146].anInt9871 = -1;
					} else {
						if (arg0.aClass375Array3[local146].anInt9874 < 0) {
							arg0.aClass375Array3[local146].anInt9874 = 0;
							if (!arg0.aBoolean747) {
								Static4.method49(arg0, local188, 0);
							}
						}
						arg0.aClass375Array3[local146].anInt9867++;
						if (arg0.aClass375Array3[local146].anInt9874 < local188.anIntArray72.length && local188.anIntArray68[arg0.aClass375Array3[local146].anInt9874] < arg0.aClass375Array3[local146].anInt9867) {
							arg0.aClass375Array3[local146].anInt9867 = 1;
							arg0.aClass375Array3[local146].anInt9874++;
							if (!arg0.aBoolean747) {
								Static4.method49(arg0, local188, arg0.aClass375Array3[local146].anInt9874);
							}
						}
						if (local188.anIntArray72.length <= arg0.aClass375Array3[local146].anInt9874) {
							if (local176.aBoolean105) {
								arg0.aClass375Array3[local146].anInt9874 -= local188.anInt1548;
								arg0.aClass375Array3[local146].anInt9866++;
								if (arg0.aClass375Array3[local146].anInt9866 >= local188.anInt1556) {
									arg0.aClass375Array3[local146].anInt9871 = -1;
								} else if (arg0.aClass375Array3[local146].anInt9874 < 0 || arg0.aClass375Array3[local146].anInt9874 >= local188.anIntArray72.length) {
									arg0.aClass375Array3[local146].anInt9871 = -1;
								} else if (!arg0.aBoolean747) {
									Static4.method49(arg0, local188, arg0.aClass375Array3[local146].anInt9874);
								}
							} else {
								arg0.aClass375Array3[local146].anInt9871 = -1;
							}
						}
						arg0.aClass375Array3[local146].anInt9872 = arg0.aClass375Array3[local146].anInt9874 + 1;
						if (local188.anIntArray72.length <= arg0.aClass375Array3[local146].anInt9872) {
							if (local176.aBoolean105) {
								arg0.aClass375Array3[local146].anInt9872 -= local188.anInt1548;
								if (arg0.aClass375Array3[local146].anInt9866 + 1 >= local188.anInt1556) {
									arg0.aClass375Array3[local146].anInt9872 = -1;
								} else if (arg0.aClass375Array3[local146].anInt9872 < 0 || local188.anIntArray72.length <= arg0.aClass375Array3[local146].anInt9872) {
									arg0.aClass375Array3[local146].anInt9872 = -1;
								}
							} else {
								arg0.aClass375Array3[local146].anInt9872 = -1;
							}
						}
					}
				}
			}
		}
		@Pc(584) Class48 local584;
		if (arg0.anInt10135 != -1 && arg0.anInt10186 <= 1) {
			local584 = Static483.aClass373_2.method8323(arg0.anInt10135);
			if (local584.anInt1555 == 3) {
				if (arg0.anInt10189 > 0 && arg0.anInt10151 <= Static621.anInt9665 && arg0.anInt10162 < Static621.anInt9665) {
					arg0.anInt10135 = -1;
					arg0.anIntArray651 = null;
				}
			} else if (local584.anInt1555 == 1 && arg0.anInt10189 > 0 && Static621.anInt9665 >= arg0.anInt10151 && Static621.anInt9665 > arg0.anInt10162) {
				arg0.anInt10186 = 2;
			}
		}
		if (arg0.anInt10135 != -1 && arg0.anInt10186 == 0) {
			local584 = Static483.aClass373_2.method8323(arg0.anInt10135);
			if (local584 == null || local584.anIntArray72 == null) {
				arg0.anIntArray651 = null;
				arg0.anInt10135 = -1;
			} else {
				arg0.anInt10140++;
				if (local584.anIntArray72.length > arg0.anInt10163 && local584.anIntArray68[arg0.anInt10163] < arg0.anInt10140) {
					arg0.anInt10163++;
					arg0.anInt10140 = 1;
					if (!arg0.aBoolean747) {
						Static4.method49(arg0, local584, arg0.anInt10163);
					}
				}
				if (local584.anIntArray72.length <= arg0.anInt10163) {
					arg0.anInt10149++;
					arg0.anInt10163 -= local584.anInt1548;
					if (arg0.anInt10149 >= local584.anInt1556) {
						arg0.anInt10135 = -1;
						arg0.anIntArray651 = null;
					} else if (arg0.anInt10163 < 0 || arg0.anInt10163 >= local584.anIntArray72.length) {
						arg0.anIntArray651 = null;
						arg0.anInt10135 = -1;
					} else if (!arg0.aBoolean747) {
						Static4.method49(arg0, local584, arg0.anInt10163);
					}
				}
				arg0.anInt10143 = arg0.anInt10163 + 1;
				if (local584.anIntArray72.length <= arg0.anInt10143) {
					arg0.anInt10143 -= local584.anInt1548;
					if (local584.anInt1556 <= arg0.anInt10149 + 1) {
						arg0.anInt10143 = -1;
					} else if (arg0.anInt10143 < 0 || arg0.anInt10143 >= local584.anIntArray72.length) {
						arg0.anInt10143 = -1;
					}
				}
			}
		}
		if (arg0.anInt10186 > 0) {
			arg0.anInt10186--;
		}
		for (@Pc(835) int local835 = 0; local835 < arg0.aClass140Array3.length; local835++) {
			@Pc(842) Class140 local842 = arg0.aClass140Array3[local835];
			if (local842 != null) {
				if (local842.anInt3495 > 0) {
					local842.anInt3495--;
				} else {
					local188 = Static483.aClass373_2.method8323(local842.anInt3493);
					if (local188 == null || local188.anIntArray72 == null) {
						arg0.aClass140Array3[local835] = null;
					} else {
						local842.anInt3494++;
						if (local188.anIntArray72.length > local842.anInt3492 && local842.anInt3494 > local188.anIntArray68[local842.anInt3492]) {
							local842.anInt3492++;
							local842.anInt3494 = 1;
							if (!arg0.aBoolean747) {
								Static4.method49(arg0, local188, local842.anInt3492);
							}
						}
						if (local842.anInt3492 >= local188.anIntArray72.length) {
							local842.anInt3496++;
							local842.anInt3492 -= local188.anInt1548;
							if (local188.anInt1556 <= local842.anInt3496) {
								arg0.aClass140Array3[local835] = null;
							} else if (local842.anInt3492 < 0 || local188.anIntArray72.length <= local842.anInt3492) {
								arg0.aClass140Array3[local835] = null;
							} else if (!arg0.aBoolean747) {
								Static4.method49(arg0, local188, local842.anInt3492);
							}
						}
						local842.anInt3497 = local842.anInt3492 + 1;
						if (local842.anInt3497 >= local188.anIntArray72.length) {
							local842.anInt3497 -= local188.anInt1548;
							if (local842.anInt3496 + 1 >= local188.anInt1556) {
								local842.anInt3497 = -1;
							} else if (local842.anInt3497 < 0 || local188.anIntArray72.length <= local842.anInt3497) {
								local842.anInt3497 = -1;
							}
						}
					}
				}
			}
		}
	}
}
