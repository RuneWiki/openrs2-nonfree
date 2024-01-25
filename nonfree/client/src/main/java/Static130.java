import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt2693 = -1;

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
	public static int anInt2695 = -1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLclient!cs;)V")
	public static void method2518(@OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class361 local11;
		if (arg0.anInt5743 != -1) {
			local11 = Static115.aClass227_1.method5968(arg0.anInt5743);
			if (local11 == null || local11.anIntArray638 == null) {
				arg0.anInt5743 = -1;
				arg0.aBoolean404 = false;
			} else {
				label357: {
					arg0.anInt5791++;
					if (arg0.lb < local11.anIntArray638.length && local11.anIntArray642[arg0.lb] < arg0.anInt5791) {
						arg0.lb++;
						arg0.anInt5791 = 1;
						arg0.anInt5709++;
						if (!arg0.aBoolean405) {
							Static74.method1765(arg0.lb, local11, arg0);
						}
					}
					if (local11.anIntArray638.length <= arg0.lb) {
						arg0.lb = 0;
						arg0.anInt5791 = 0;
						if (arg0.aBoolean404) {
							arg0.anInt5743 = arg0.method5058().method3685();
							if (arg0.anInt5743 == -1) {
								arg0.aBoolean404 = false;
								break label357;
							}
							local11 = Static115.aClass227_1.method5968(arg0.anInt5743);
						}
						if (!arg0.aBoolean405) {
							Static74.method1765(arg0.lb, local11, arg0);
						}
					}
					arg0.anInt5709 = arg0.lb + 1;
					if (local11.anIntArray638 == null) {
						arg0.anInt5743 = -1;
						arg0.aBoolean404 = false;
					} else if (arg0.anInt5709 >= local11.anIntArray638.length) {
						arg0.anInt5709 = 0;
					}
				}
			}
		}
		@Pc(165) int local165;
		@Pc(177) Class361 local177;
		@Pc(162) Class145 local162;
		if (arg0.anInt5720 != -1 && arg0.anInt5755 <= Static101.anInt2262) {
			local162 = Static275.aClass68_2.method2087(arg0.anInt5720);
			local165 = local162.anInt4224;
			if (local165 == -1) {
				arg0.anInt5720 = -1;
			} else {
				label358: {
					local177 = Static115.aClass227_1.method5968(local165);
					if (local162.aBoolean288) {
						if (local177.anInt9859 == 3) {
							if (arg0.anInt5793 > 0 && arg0.anInt5788 <= Static101.anInt2262 && arg0.anInt5754 < Static101.anInt2262) {
								arg0.anInt5720 = -1;
								break label358;
							}
						} else if (local177.anInt9859 == 1 && arg0.anInt5793 > 0 && Static101.anInt2262 >= arg0.anInt5788 && arg0.anInt5754 < Static101.anInt2262) {
							arg0.anInt5755 = Static101.anInt2262 + 1;
							break label358;
						}
					}
					if (local177 == null || local177.anIntArray638 == null) {
						arg0.anInt5720 = -1;
					} else {
						if (arg0.anInt5714 < 0) {
							arg0.anInt5714 = 0;
							if (!arg0.aBoolean405) {
								Static74.method1765(0, local177, arg0);
							}
						}
						arg0.anInt5752++;
						if (arg0.anInt5714 < local177.anIntArray638.length && local177.anIntArray642[arg0.anInt5714] < arg0.anInt5752) {
							arg0.anInt5752 = 1;
							arg0.anInt5714++;
							if (!arg0.aBoolean405) {
								Static74.method1765(arg0.anInt5714, local177, arg0);
							}
						}
						if (local177.anIntArray638.length <= arg0.anInt5714) {
							if (local162.aBoolean288) {
								arg0.anInt5776++;
								arg0.anInt5714 -= local177.anInt9863;
								if (arg0.anInt5776 >= local177.anInt9865) {
									arg0.anInt5720 = -1;
								} else if (arg0.anInt5714 < 0 || local177.anIntArray638.length <= arg0.anInt5714) {
									arg0.anInt5720 = -1;
								} else if (!arg0.aBoolean405) {
									Static74.method1765(arg0.anInt5714, local177, arg0);
								}
							} else {
								arg0.anInt5720 = -1;
							}
						}
						arg0.anInt5769 = arg0.anInt5714 + 1;
						if (local177.anIntArray638.length <= arg0.anInt5769) {
							if (local162.aBoolean288) {
								arg0.anInt5769 -= local177.anInt9863;
								if (arg0.anInt5776 + 1 >= local177.anInt9865) {
									arg0.anInt5769 = -1;
								} else if (arg0.anInt5769 < 0 || local177.anIntArray638.length <= arg0.anInt5769) {
									arg0.anInt5769 = -1;
								}
							} else {
								arg0.anInt5769 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5717 != -1 && Static101.anInt2262 >= arg0.anInt5716) {
			local162 = Static275.aClass68_2.method2087(arg0.anInt5717);
			local165 = local162.anInt4224;
			if (local165 == -1) {
				arg0.anInt5717 = -1;
			} else {
				label362: {
					local177 = Static115.aClass227_1.method5968(local165);
					if (local162.aBoolean288) {
						if (local177.anInt9859 == 3) {
							if (arg0.anInt5793 > 0 && arg0.anInt5788 <= Static101.anInt2262 && Static101.anInt2262 > arg0.anInt5754) {
								arg0.anInt5717 = -1;
								break label362;
							}
						} else if (local177.anInt9859 == 1 && arg0.anInt5793 > 0 && Static101.anInt2262 >= arg0.anInt5788 && Static101.anInt2262 > arg0.anInt5754) {
							arg0.anInt5716 = Static101.anInt2262 + 1;
							break label362;
						}
					}
					if (local177 == null || local177.anIntArray638 == null) {
						arg0.anInt5717 = -1;
					} else {
						if (arg0.anInt5765 < 0) {
							arg0.anInt5765 = 0;
							if (!arg0.aBoolean405) {
								Static74.method1765(0, local177, arg0);
							}
						}
						arg0.anInt5783++;
						if (arg0.anInt5765 < local177.anIntArray638.length && arg0.anInt5783 > local177.anIntArray642[arg0.anInt5765]) {
							arg0.anInt5783 = 1;
							arg0.anInt5765++;
							if (!arg0.aBoolean405) {
								Static74.method1765(arg0.anInt5765, local177, arg0);
							}
						}
						if (local177.anIntArray638.length <= arg0.anInt5765) {
							if (local162.aBoolean288) {
								arg0.anInt5765 -= local177.anInt9863;
								arg0.anInt5778++;
								if (arg0.anInt5778 >= local177.anInt9865) {
									arg0.anInt5717 = -1;
								} else if (arg0.anInt5765 < 0 || arg0.anInt5765 >= local177.anIntArray638.length) {
									arg0.anInt5717 = -1;
								} else if (!arg0.aBoolean405) {
									Static74.method1765(arg0.anInt5765, local177, arg0);
								}
							} else {
								arg0.anInt5717 = -1;
							}
						}
						arg0.anInt5726 = arg0.anInt5765 + 1;
						if (arg0.anInt5726 >= local177.anIntArray638.length) {
							if (local162.aBoolean288) {
								arg0.anInt5726 -= local177.anInt9863;
								if (arg0.anInt5778 + 1 >= local177.anInt9865) {
									arg0.anInt5726 = -1;
								} else if (arg0.anInt5726 < 0 || local177.anIntArray638.length <= arg0.anInt5726) {
									arg0.anInt5726 = -1;
								}
							} else {
								arg0.anInt5726 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt5718 != -1 && arg0.anInt5710 <= 1) {
			local11 = Static115.aClass227_1.method5968(arg0.anInt5718);
			if (local11.anInt9859 == 3) {
				if (arg0.anInt5793 > 0 && Static101.anInt2262 >= arg0.anInt5788 && arg0.anInt5754 < Static101.anInt2262) {
					arg0.anIntArray306 = null;
					arg0.anInt5718 = -1;
				}
			} else if (local11.anInt9859 == 1 && arg0.anInt5793 > 0 && arg0.anInt5788 <= Static101.anInt2262 && Static101.anInt2262 > arg0.anInt5754) {
				arg0.anInt5710 = 2;
			}
		}
		if (arg0.anInt5718 != -1 && arg0.anInt5710 == 0) {
			local11 = Static115.aClass227_1.method5968(arg0.anInt5718);
			if (local11 == null || local11.anIntArray638 == null) {
				arg0.anIntArray306 = null;
				arg0.anInt5718 = -1;
			} else {
				arg0.anInt5723++;
				if (arg0.anInt5770 < local11.anIntArray638.length && arg0.anInt5723 > local11.anIntArray642[arg0.anInt5770]) {
					arg0.anInt5723 = 1;
					arg0.anInt5770++;
					if (!arg0.aBoolean405) {
						Static74.method1765(arg0.anInt5770, local11, arg0);
					}
				}
				if (local11.anIntArray638.length <= arg0.anInt5770) {
					arg0.anInt5763++;
					arg0.anInt5770 -= local11.anInt9863;
					if (arg0.anInt5763 >= local11.anInt9865) {
						arg0.anInt5718 = -1;
						arg0.anIntArray306 = null;
					} else if (arg0.anInt5770 < 0 || arg0.anInt5770 >= local11.anIntArray638.length) {
						arg0.anIntArray306 = null;
						arg0.anInt5718 = -1;
					} else if (!arg0.aBoolean405) {
						Static74.method1765(arg0.anInt5770, local11, arg0);
					}
				}
				arg0.anInt5777 = arg0.anInt5770 + 1;
				if (local11.anIntArray638.length <= arg0.anInt5777) {
					arg0.anInt5777 -= local11.anInt9863;
					if (local11.anInt9865 <= arg0.anInt5763 + 1) {
						arg0.anInt5777 = -1;
					} else if (arg0.anInt5777 < 0 || local11.anIntArray638.length <= arg0.anInt5777) {
						arg0.anInt5777 = -1;
					}
				}
			}
		}
		if (arg0.anInt5710 > 0) {
			arg0.anInt5710--;
		}
		for (@Pc(996) int local996 = 0; local996 < arg0.aClass256Array3.length; local996++) {
			@Pc(1003) Class256 local1003 = arg0.aClass256Array3[local996];
			if (local1003 != null) {
				if (local1003.anInt7636 > 0) {
					local1003.anInt7636--;
				} else {
					local177 = Static115.aClass227_1.method5968(local1003.anInt7639);
					if (local177 == null || local177.anIntArray638 == null) {
						arg0.aClass256Array3[local996] = null;
					} else {
						local1003.anInt7629++;
						if (local177.anIntArray638.length > local1003.anInt7631 && local1003.anInt7629 > local177.anIntArray642[local1003.anInt7631]) {
							local1003.anInt7629 = 1;
							local1003.anInt7631++;
							if (!arg0.aBoolean405) {
								Static74.method1765(local1003.anInt7631, local177, arg0);
							}
						}
						if (local1003.anInt7631 >= local177.anIntArray638.length) {
							local1003.anInt7631 -= local177.anInt9863;
							local1003.anInt7633++;
							if (local177.anInt9865 <= local1003.anInt7633) {
								arg0.aClass256Array3[local996] = null;
							} else if (local1003.anInt7631 < 0 || local1003.anInt7631 >= local177.anIntArray638.length) {
								arg0.aClass256Array3[local996] = null;
							} else if (!arg0.aBoolean405) {
								Static74.method1765(local1003.anInt7631, local177, arg0);
							}
						}
						local1003.anInt7637 = local1003.anInt7631 + 1;
						if (local177.anIntArray638.length <= local1003.anInt7637) {
							local1003.anInt7637 -= local177.anInt9863;
							if (local177.anInt9865 <= local1003.anInt7633 + 1) {
								local1003.anInt7637 = -1;
							} else if (local1003.anInt7637 < 0 || local1003.anInt7637 >= local177.anIntArray638.length) {
								local1003.anInt7637 = -1;
							}
						}
					}
				}
			}
		}
	}
}
